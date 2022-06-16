package com.uade.ad.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

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

    private String password;

}
