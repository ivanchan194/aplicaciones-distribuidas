package com.uade.ad.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class Photo {
    @Id
    @GeneratedValue
    private int idPhoto;

    private String photoUrl;

    private String fileExtension;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Recipe recipe;
}
