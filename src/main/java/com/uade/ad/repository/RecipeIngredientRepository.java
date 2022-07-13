package com.uade.ad.repository;

import com.uade.ad.model.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Integer> {
    @Modifying
    @Query("DELETE FROM RecipeIngredient ri WHERE ri.idRecipeIngredient in ?1")
    void deleteRecipeIngredientByIdRecipeIngredientIn(List<Integer> ids);
}
