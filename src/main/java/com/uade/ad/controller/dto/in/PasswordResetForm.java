package com.uade.ad.controller.dto.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordResetForm {
    @Schema(example = "test@mail.com")
    private String email;

    @Schema(example = "123456")
    private Integer resetCode;

    @Schema(example = "newPassword")
    private String newPassword;
}
