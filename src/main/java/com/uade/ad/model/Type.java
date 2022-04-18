package com.uade.ad.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class Type {
    @Id
    private int idType;

    private String description;

    @OneToMany
    private List<Recipe> recipes;
}
