package com.uade.ad.controller.dto.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm {
    @Schema(example = "testAlumnoNickname")
    private String username;
    @Schema(example = "Password1")
    private String password;
}
