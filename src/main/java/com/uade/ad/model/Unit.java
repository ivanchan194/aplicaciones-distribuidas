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
