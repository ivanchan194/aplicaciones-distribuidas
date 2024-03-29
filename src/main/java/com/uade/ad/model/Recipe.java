package com.uade.ad.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idRecipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecipe;

    private String name;

    private String description;

    private int portions;

    private int numberPeople;

    @Column(nullable = true)
    private String photoUrl;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Type type;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private User user;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private Set<Photo> photos;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Step> steps;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private Set<RecipeIngredient> recipeIngredientSet;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private Set<Rating> ratingSet;

    public boolean containsIngredient(String ingredient) {
        return recipeIngredientSet.stream().anyMatch(
                recipeIngredient -> recipeIngredient.getIngredient().getName().toLowerCase(Locale.ROOT).equals(ingredient));
    }
}
