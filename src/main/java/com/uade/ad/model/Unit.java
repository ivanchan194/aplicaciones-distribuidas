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
public class Unit {
    @Id
    @GeneratedValue
    private int idUnit;

    private String description;

    @OneToMany(mappedBy = "originUnit", cascade = CascadeType.ALL)
    private Set<Conversions> originConversions;

    @OneToMany(mappedBy = "destinationUnit", cascade = CascadeType.ALL)
    private Set<Conversions> destinationConversions;
}
