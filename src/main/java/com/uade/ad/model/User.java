package com.uade.ad.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder(setterPrefix = "set")
public class User {
    @Id
    private int idUser;

    public User() {}
}
