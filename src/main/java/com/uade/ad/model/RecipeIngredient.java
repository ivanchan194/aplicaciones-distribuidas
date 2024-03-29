package com.uade.ad.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idRecipeIngredient")
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecipeIngredient;

    private int quantity;

    private String observations;

    @ManyToOne(optional = false)
    private Unit unit;

    @ManyToOne(optional = false)
    @JsonIgnore
    private Recipe recipe;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Ingredient ingredient;
}
