package com.uade.ad.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Set<RecipeIngredient> recipeIngredientSet;
}
