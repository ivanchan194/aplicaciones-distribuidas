package com.uade.ad.model;

import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class Ingredient {
    @Id
    @GeneratedValue
    private int idIngredient;

    private String name;

    @OneToMany(mappedBy = "ingredient", cascade = CascadeType.ALL)
    private Set<RecipeIngredient> recipeIngredientSet;
}
