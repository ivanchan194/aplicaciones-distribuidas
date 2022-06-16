package com.uade.ad.controller;

import com.uade.ad.model.Unit;
import com.uade.ad.service.UnitService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/unit")
public class UnitController {
    private final UnitService unitService;

    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

    @Operation(summary = "Get all units")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Units successfully retrieved", content = @Content),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @GetMapping("/units")
    public List<Unit> units(){
        return new ArrayList<Unit>();
    }
}
