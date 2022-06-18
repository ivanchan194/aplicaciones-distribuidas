package com.uade.ad.controller.dto.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterForm {
    @Schema(example = "testUsername")
    private String username;

    @Schema(example = "Uade")
    private String password;

    @Schema(example = "testUsername@mail.com")
    private String email;
}
