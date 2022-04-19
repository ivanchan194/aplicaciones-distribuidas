package com.uade.ad.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class Rating {
    @Id
    @GeneratedValue
    private int idRating;

    private int rating;

    private String comments;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Recipe recipe;
}
