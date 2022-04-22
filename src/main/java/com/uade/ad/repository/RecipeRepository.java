package com.uade.ad.repository;

import com.uade.ad.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    Recipe findRecipeByIdRecipe(int i);
}
