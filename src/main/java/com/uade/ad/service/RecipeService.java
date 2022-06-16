package com.uade.ad.service;

import com.uade.ad.model.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> findRecipesByFilterAndValue(String filterBy, String value);

    List<Recipe> findAll();
}
