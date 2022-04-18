package com.uade.ad.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class Step {
    @Id
    private int idStep;

    private int stepNumber;

    private String text;
}
