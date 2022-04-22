package com.uade.ad.model;

import java.util.List;
import java.util.Set;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column(nullable = false)
    private String photoUrl;

    @ManyToOne(optional = false)
    private Type type;

    @ManyToOne(optional = false)
    private User user;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Photo> photos;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Step> steps;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<RecipeIngredient> recipeIngredientSet;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Rating> ratingSet;
}
