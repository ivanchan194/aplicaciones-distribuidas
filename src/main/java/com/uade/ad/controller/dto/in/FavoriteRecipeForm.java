package com.uade.ad.controller.dto.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavoriteRecipeForm {

    @Schema(example = "1")
    private int idUser;

    @Schema(example = "1")
    private int idRecipe;
}
