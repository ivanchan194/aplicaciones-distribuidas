package com.uade.ad.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idPhoto")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPhoto;

    private String photoUrl;

    private String fileExtension;

    @ManyToOne(optional = false)
    @JsonIgnore
    private Recipe recipe;
}
