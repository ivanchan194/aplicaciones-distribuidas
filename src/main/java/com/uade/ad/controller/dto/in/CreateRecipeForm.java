package com.uade.ad.controller.dto.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class CreateRecipeForm {
    @Schema(example = "Empanada")
    private String name;

    @Schema(example = "testUsername")
    private String username;

    @Schema(example = "Argentina")
    private String type;

    @Schema(example = "7")
    private int peopleServed;

    @Schema(example = "21")
    private int portions;

    private List<IngredientDto> ingredients;

    private List<StepDto> steps;

}
