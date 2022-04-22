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

    @ManyToOne(optional = false)
    private Unit unit;

    @ManyToOne(optional = false)
    private Recipe recipe;

    @ManyToOne(optional = false)
    private Ingredient ingredient;
}
