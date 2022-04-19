package com.uade.ad.model;

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
    private Set<Recipe> recipes;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Rating> ratingSet;
}
