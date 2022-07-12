package com.uade.ad.service;

import com.uade.ad.controller.dto.in.CreateRecipeForm;
import com.uade.ad.controller.dto.in.ReviewForm;
import com.uade.ad.model.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> findRecipesByFilterAndValue(String filterBy, String value);

    List<Recipe> findAll();

    Recipe findRecipeById(int id);

    void createRecipe(CreateRecipeForm createRecipeForm);

    Recipe findRecipeByIdUserAndRecipeName(int idUser, String recipeName);

    void addRecipeReview(int idUser, int recipeId, ReviewForm reviewForm);
}
