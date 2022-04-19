package com.uade.ad.model;

import java.util.List;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class Recipe {
    @Id
    @GeneratedValue
    private int idRecipe;

    private String name;

    private String description;

    private int portions;

    private int numberPeople;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Type type;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User user;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private Set<Photo> photos;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Step> steps;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private Set<RecipeIngredient> recipeIngredientSet;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private Set<Rating> ratingSet;
}
