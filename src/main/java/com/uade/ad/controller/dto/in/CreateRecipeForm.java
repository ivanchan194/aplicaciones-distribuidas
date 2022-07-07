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

    private List<String> photoUrl;

    @Schema(example = "testAlumno@mail.com")
    private String email;

    @Schema(example = "Rica empanada de carne")
    private String description;

    @Schema(example = "Argentina")
    private int idType;

    @Schema(example = "7")
    private int peopleServed;

    @Schema(example = "21")
    private int portions;

    private List<IngredientDto> ingredients;

    private List<StepDto> steps;

}
