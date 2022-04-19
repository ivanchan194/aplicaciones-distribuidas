package com.uade.ad.model;

import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class Type {
    @Id
    @GeneratedValue
    private int idType;

    private String description;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    private Set<Recipe> recipes;
}
