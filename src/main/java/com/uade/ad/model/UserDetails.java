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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserDetail;

    @OneToOne
    @MapsId
    @JsonIgnore
    private User user;

    private Integer age;

    private String country;

    private String password;

    private Integer resetToken;

}
