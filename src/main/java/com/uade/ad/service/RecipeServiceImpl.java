package com.uade.ad.service;

import com.uade.ad.model.Recipe;
import com.uade.ad.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @Override
    public List<Recipe> findRecipesByFilterAndValue(String filterBy, String value) {
        List<Recipe> foundRecipes = new ArrayList<>();
        switch(filterBy) {
            case "nombre":
                foundRecipes = recipeRepository.findRecipeByName(value);
                break;
            case "usuario":
                foundRecipes = recipeRepository.findRecipeByUserNickname(value);
                break;
            case "tipo":
                foundRecipes = recipeRepository.findRecipeByTypeDescription(value);
                break;
            case "ingrediente":
                break;
            case "noIngrediente":
                break;
            default:
                break;
        }
        return foundRecipes;
    }

    @Override
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }
}
