package com.uade.ad.service;

import com.uade.ad.model.Recipe;
import com.uade.ad.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @Override
    public List<Recipe> findRecipesByFilterAndValue(String filterBy, String value) {
        List<Recipe> foundRecipes = new ArrayList<>();
        switch (filterBy.toLowerCase(Locale.ROOT)) {
            case "nombre" -> foundRecipes = recipeRepository.findRecipeByName(value);
            case "usuario" -> foundRecipes = recipeRepository.findRecipeByUserNickname(value);
            case "tipo" -> foundRecipes = recipeRepository.findRecipeByTypeDescription(value);
            case "ingrediente" -> {
                foundRecipes = recipeRepository.findAll();
                foundRecipes.removeIf(recipe -> !recipe.containsIngredient(value));
            }
            case "noingrediente" -> {
                foundRecipes = recipeRepository.findAll();
                foundRecipes.removeIf(recipe -> recipe.containsIngredient(value));
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
}
