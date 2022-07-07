package com.uade.ad.service;

import com.uade.ad.controller.dto.in.CreateRecipeForm;
import com.uade.ad.controller.dto.in.IngredientDto;
import com.uade.ad.controller.dto.in.StepDto;
import com.uade.ad.model.*;
import com.uade.ad.repository.RecipeRepository;
import com.uade.ad.repository.TypeRepository;
import com.uade.ad.repository.UnitRepository;
import com.uade.ad.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    private final TypeRepository typeRepository;

    private final UnitRepository unitRepository;

    private final UserRepository userRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository,
                             TypeRepository typeRepository,
                             UnitRepository unitRepository,
                             UserRepository userRepository) {
        this.recipeRepository = recipeRepository;
        this.typeRepository = typeRepository;
        this.unitRepository = unitRepository;
        this.userRepository = userRepository;
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
