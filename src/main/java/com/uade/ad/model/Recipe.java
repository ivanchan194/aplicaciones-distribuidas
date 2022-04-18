package com.uade.ad.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class Recipe {
    @Id
    private int idRecipe;

    private String name;

    private String description;

    private int portions;

    private int numberPeople;

    @ManyToOne
    private Type type;
}
