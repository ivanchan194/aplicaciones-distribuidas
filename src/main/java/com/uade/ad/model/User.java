package com.uade.ad.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.uade.ad.utils.YesNoBooleanConverter;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idUser")
public class User {
    @Id
    @GeneratedValue
    private int idUser;

    @Column(unique = true)
    private String email;

    private String nickname;

    private String name;

    private String avatarUrl;

    @Convert(converter = YesNoBooleanConverter.class)
    private boolean enabled;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Recipe> recipes;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Rating> ratingSet;

    @OneToOne(mappedBy = "user")
    private UserDetails userDetails;
}
