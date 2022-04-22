package com.uade.ad.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.*;
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
