package com.uade.ad.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
}
