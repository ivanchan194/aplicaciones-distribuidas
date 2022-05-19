package com.uade.ad.controller.dto.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
public class StepDto {
    @Schema(example = "1")
    private int stepNumber;

    @Schema(example = "Cortar la cebolla en juliana")
    private String text;

    private List<MultipartFile> files;
}
