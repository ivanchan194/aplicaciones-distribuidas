package com.uade.ad.controller.dto.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordResetForm {
    @Schema(example = "testAlumno@mail.com")
    private String email;

    @Schema(example = "1234")
    private Integer resetToken;

    @Schema(example = "newPassword")
    private String newPassword;
}
