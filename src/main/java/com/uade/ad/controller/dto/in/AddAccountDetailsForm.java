package com.uade.ad.controller.dto.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddAccountDetailsForm {
    @Schema(example = "testUsername@mail.com")
    private String email;

    @Schema(example = "First")
    private String firstName;

    @Schema(example = "Last")
    private String lastName;

    @Schema(example = "30")
    private Integer age;

    @Schema(example = "Argentina")
    private String country;
}
