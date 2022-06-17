package com.uade.ad.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idType")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idType;

    private String description;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Recipe> recipes;
}
