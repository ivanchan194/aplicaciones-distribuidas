package com.uade.ad.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class UserDetails {
    @Id
    @GeneratedValue
    private int idUserDetail;

    @OneToOne
    @MapsId
    @JsonIgnore
    private User user;

    @Column(nullable = true)
    private String password;

    @Column(nullable = true)
    private Integer resetToken;

}
