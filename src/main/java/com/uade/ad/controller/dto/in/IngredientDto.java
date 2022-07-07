package com.uade.ad.controller.dto.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IngredientDto {
    @Schema(example = "Arvejas")
    private String name;

    @Schema(example = "8")
    private int quantity;

    @Schema(example = "1")
    private int idUnit;

}
