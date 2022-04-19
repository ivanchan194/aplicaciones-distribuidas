package com.uade.ad.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
}
