package com.uade.ad.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Schema(example = "1")
    private Long id;

    private String name;

    private Integer salary;

    private String department;
}