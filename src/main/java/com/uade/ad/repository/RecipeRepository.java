package com.uade.ad.repository;

import com.uade.ad.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    Recipe findRecipeByIdRecipe(int i);

    List<Recipe> findRecipeByUserNickname(String nickanme);

    List<Recipe> findRecipeByName(String filterBy);

    List<Recipe> findRecipeByTypeDescription(String value);
}
