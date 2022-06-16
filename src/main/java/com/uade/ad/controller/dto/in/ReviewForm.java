package com.uade.ad.controller.dto.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewForm {
    @Schema(example = "5")
    private int stars;

    @Schema(example = "Excelente")
    private String comment;
}
