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
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idStep")
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStep;

    private int stepNumber;

    private String text;

    @ManyToOne(optional = false)
    @JsonIgnore
    private Recipe recipe;

    @OneToMany(mappedBy = "step", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Multimedia> multimediaSet;
}
