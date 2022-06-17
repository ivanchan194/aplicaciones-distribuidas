package com.uade.ad.controller.dto.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestPasswordResetForm {
    @Schema(example = "testalumno@mail.com")
    private String email;
}
