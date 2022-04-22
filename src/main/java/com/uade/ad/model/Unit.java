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
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idUnit")
public class Unit {
    @Id
    @GeneratedValue
    private int idUnit;

    private String description;

    @OneToMany(mappedBy = "originUnit", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Conversions> originConversions;

    @OneToMany(mappedBy = "destinationUnit", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Conversions> destinationConversions;
}
