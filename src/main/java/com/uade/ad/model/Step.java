package com.uade.ad.model;

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
public class Step {
    @Id
    @GeneratedValue
    private int idStep;

    private int stepNumber;

    private String text;

    @ManyToOne(optional = false)
    private Recipe recipe;

    @OneToMany(mappedBy = "step", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Multimedia> multimediaSet;
}
