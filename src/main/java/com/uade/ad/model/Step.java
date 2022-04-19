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
public class Step {
    @Id
    @GeneratedValue
    private int idStep;

    private int stepNumber;

    private String text;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Recipe recipe;

    @OneToMany(mappedBy = "step", cascade = CascadeType.ALL)
    private Set<Multimedia> multimediaSet;
}
