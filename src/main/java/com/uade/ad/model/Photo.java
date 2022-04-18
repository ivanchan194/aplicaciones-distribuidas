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
public class Photo {
    @Id
    private int idPhoto;

    private String photoUrl;

    private String fileExtension;
}
