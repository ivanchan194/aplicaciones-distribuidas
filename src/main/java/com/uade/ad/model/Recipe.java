package com.uade.ad.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder(setterPrefix = "set")
public class Recipe {
    @Id
    private int idRecipe;

    public Recipe() {}
}
