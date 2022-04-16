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
public class Ingredient {
    @Id
    private int idIngredient;

    public Ingredient() {}
}
