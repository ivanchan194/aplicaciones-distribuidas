package com.uade.ad.service;

import com.uade.ad.controller.dto.in.CreateRecipeForm;
import com.uade.ad.controller.dto.in.IngredientDto;
import com.uade.ad.controller.dto.in.ReviewForm;
import com.uade.ad.controller.dto.in.StepDto;
import com.uade.ad.exception.InternalServerErrorException;
import com.uade.ad.exception.UserErrorException;
import com.uade.ad.model.*;
import com.uade.ad.repository.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    private final TypeRepository typeRepository;

    private final UnitRepository unitRepository;

    private final UserRepository userRepository;

    private final RatingRepository ratingRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository,
                             TypeRepository typeRepository,
                             UnitRepository unitRepository,
                             UserRepository userRepository,
                             RatingRepository ratingRepository) {
        this.recipeRepository = recipeRepository;
        this.typeRepository = typeRepository;
        this.unitRepository = unitRepository;
        this.userRepository = userRepository;
        this.ratingRepository = ratingRepository;
    }
    @Override
    public List<Recipe> findRecipesByFilterAndValue(String filterBy, String value) {
        List<Recipe> foundRecipes = new ArrayList<>();
        switch (filterBy.toLowerCase(Locale.ROOT)) {
            case "nombre" -> foundRecipes = recipeRepository.findRecipeByNameIgnoreCaseContaining(value);
            case "usuario" -> foundRecipes = recipeRepository.findRecipeByUserNicknameIgnoreCaseContaining(value);
            case "tipo" -> foundRecipes = recipeRepository.findRecipeByTypeDescriptionIgnoreCaseContaining(value);
            case "ingrediente" -> {
                foundRecipes = recipeRepository.findAll();
                foundRecipes.removeIf(recipe -> !recipe.containsIngredient(value.toLowerCase(Locale.ROOT)));
            }
            case "noingrediente" -> {
                foundRecipes = recipeRepository.findAll();
                foundRecipes.removeIf(recipe -> recipe.containsIngredient(value.toLowerCase(Locale.ROOT)));
            }
            default -> {
            }
        }
        return foundRecipes;
    }

    @Override
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe findRecipeById(int id) {
        return recipeRepository.findRecipeByIdRecipe(id);
    }

    @Override
    public void createRecipe(CreateRecipeForm form) {
        Recipe newRecipe = new Recipe();
        newRecipe.setName(form.getName());
        newRecipe.setDescription(form.getDescription());
        newRecipe.setPortions(form.getPortions());
        newRecipe.setNumberPeople(form.getPeopleServed());
        newRecipe.setPhotoUrl(form.getPhotoUrl().get(0));
        newRecipe.setType(typeRepository.findTypeByIdType(form.getIdType()));
        newRecipe.setUser(userRepository.findUserByEmail(form.getEmail()));
        newRecipe.setPhotos(createPhotos(form.getPhotoUrl(), newRecipe));
        newRecipe.setSteps(createSteps(form.getSteps(), newRecipe));
        newRecipe.setRecipeIngredientSet(createRecipeIngredients(form.getIngredients(), newRecipe));
        recipeRepository.save(newRecipe);
    }

    @Override
    public Recipe findRecipeByIdUserAndRecipeName(int idUser, String recipeName) {
        try {
            User user = userRepository.findUserByIdUser(idUser);
            if(user != null) {
                List<Recipe> recipes =
                        user.getRecipes().stream()
                                .filter(recipe -> recipe.getName().toLowerCase(Locale.ROOT).equals(recipeName))
                                .toList();
                if (recipes.size() == 1) {
                    return recipes.get(0);
                } else if (recipes.size() == 0){
                    throw new UserErrorException();
                } else {
                    throw new InternalServerErrorException();
                }
            } else {
                throw new UserErrorException();
            }
        } catch (UserErrorException e) {
            throw e;
        } catch (Exception e) {
            throw new InternalServerErrorException();
        }
    }

    @Override
    public void addRecipeReview(int idUser, int recipeId, ReviewForm reviewForm) {
        try {
            Recipe recipe = recipeRepository.findRecipeByIdRecipe(recipeId);
            User user = userRepository.findUserByIdUser(idUser);
            if (recipe != null && user != null) {
                Rating rating = new Rating();
                rating.setRating(reviewForm.getStars());
                rating.setComments(reviewForm.getComment());
                rating.setUser(user);
                rating.setRecipe(recipe);
                ratingRepository.save(rating);
            } else {
                throw new UserErrorException();
            }
        } catch (UserErrorException e) {
            throw e;
        } catch (Exception e) {
            throw new InternalServerErrorException();
        }
    }

    private Set<Photo> createPhotos(List<String> photoUrls, Recipe recipe) {
        Set<Photo> photos = new HashSet<>();

        for (String url : photoUrls) {
            Photo photo = new Photo();
            photo.setPhotoUrl(url);
            photo.setFileExtension("jpg");
            photo.setRecipe(recipe);
            photos.add(photo);
        }

        return photos;
    }

    private List<Step> createSteps(List<StepDto> stepDtos, Recipe recipe) {
        List<Step> steps = new ArrayList<>();

        for (StepDto stepDto : stepDtos) {
            Step step = new Step();
            step.setStepNumber(stepDto.getStepNumber());
            step.setText(stepDto.getText());

            Multimedia multimedia = new Multimedia();
            multimedia.setStep(step);
            multimedia.setFileExtension("jpg");
            multimedia.setContentType(ContentType.PHOTO);
            multimedia.setContentUrl(stepDto.getFile());

            Set<Multimedia> multimediaSet = new HashSet<>();
            multimediaSet.add(multimedia);

            step.setMultimediaSet(multimediaSet);
            step.setRecipe(recipe);

            steps.add(step);
        }

        return steps;
    }

    private Set<RecipeIngredient> createRecipeIngredients(List<IngredientDto> ingredientDtos, Recipe recipe) {
        Set<RecipeIngredient> recipeIngredientSet = new HashSet<>();
        for (IngredientDto ingredientDto : ingredientDtos) {
            RecipeIngredient recipeIngredient = new RecipeIngredient();

            Ingredient ingredient = new Ingredient();
            ingredient.setName(ingredientDto.getName());

            recipeIngredient.setIngredient(ingredient);
            recipeIngredient.setObservations("none");
            recipeIngredient.setQuantity(ingredientDto.getQuantity());
            recipeIngredient.setRecipe(recipe);
            recipeIngredient.setUnit(unitRepository.findUnitByIdUnit(ingredientDto.getIdUnit()));

            recipeIngredientSet.add(recipeIngredient);
        }
        return recipeIngredientSet;
    }
}
