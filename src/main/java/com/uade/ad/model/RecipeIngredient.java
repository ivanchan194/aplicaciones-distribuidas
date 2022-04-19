package com.uade.ad.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class RecipeIngredient {
    @Id
    @GeneratedValue
    private int idRecipeIngredient;

    private int quantity;

    private String observations;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Unit unit;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Recipe recipe;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ingredient ingredient;
}
