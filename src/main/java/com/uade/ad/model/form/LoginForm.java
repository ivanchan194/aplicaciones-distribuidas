package com.uade.ad.model.form;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm {
    @Schema(example = "user")
    private String username;
    @Schema(example = "password")
    private String password;
}
