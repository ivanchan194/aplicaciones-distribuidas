package com.uade.ad.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idConversion")
public class Conversions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConversion;

    private float conversionFactor;

    @ManyToOne(optional = false)
    private Unit originUnit;

    @ManyToOne(optional = false)
    private Unit destinationUnit;
}
