package com.uade.ad.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class Conversions {
    @Id
    @GeneratedValue
    private int idConversion;

    private float conversionFactor;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Unit originUnit;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Unit destinationUnit;
}
