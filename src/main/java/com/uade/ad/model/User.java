package com.uade.ad.model;

import javax.persistence.*;

import com.uade.ad.utils.YesNoBooleanConverter;
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

    private String email;

    private String nickname;

    private String name;

    private String avatarUrl;

    @Convert(converter = YesNoBooleanConverter.class)
    private boolean enabled;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
