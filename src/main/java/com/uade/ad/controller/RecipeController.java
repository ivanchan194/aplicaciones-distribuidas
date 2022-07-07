package com.uade.ad.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.uade.ad.controller.dto.in.CreateRecipeForm;
import com.uade.ad.controller.dto.in.ReviewForm;
import com.uade.ad.model.Recipe;
import com.uade.ad.service.RecipeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    private final Cloudinary cloudinary = new Cloudinary();

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @Operation(summary = "Get all recipes")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Recipes successfully retrieved", content = @Content),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @GetMapping("/recipes")
    public List<Recipe> recipesByName(@RequestParam(value = "filterBy", required = false) String filterBy,
                                      @RequestParam(value = "value", required = false) String value) {
            List<Recipe> foundRecipes = new ArrayList<>();
        if(filterBy != null) {
            foundRecipes = recipeService.findRecipesByFilterAndValue(filterBy, value);
        } else {
            foundRecipes = recipeService.findAll();
        }

        return foundRecipes;
    }

    @Operation(summary = "Get recipes by Ids")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Recipes successfully retrieved", content = @Content),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @GetMapping("/recipes/byIds")
    public List<Recipe> recipesByIds(@RequestParam(value = "Id", required = true) List<Integer> ids) {
        List<Recipe> foundRecipes = new ArrayList<>();

        for(int id : ids) {
            Recipe recipe = recipeService.findRecipeById(id);
            if(!(recipe == null)) {
                foundRecipes.add(recipeService.findRecipeById(id));
            }
        }

        return foundRecipes;
    }

    @Operation(summary = "Create a recipe")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Recipes successfully created", content = @Content),
            @ApiResponse(responseCode = "404", description = "Error in recipe", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @PostMapping("/recipe")
    public void createRecipe(@RequestBody CreateRecipeForm createRecipeForm){
        recipeService.createRecipe(createRecipeForm);
    }

    @Operation(summary = "Add a review to a recipe")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Review successfully created", content = @Content),
            @ApiResponse(responseCode = "404", description = "Error in recipe", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @PostMapping("/recipe/review/{recipeId}")
    public void addComment(@PathVariable int recipeId, @RequestBody ReviewForm reviewForm){
    }

    @PostMapping(value="/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity uploadGif(@RequestPart("file") MultipartFile multipartFile,
                                    @RequestPart("title") String title) throws IOException {
        String hola = "hola";
        Map url = cloudinary.uploader().upload(multipartFile.getBytes(), ObjectUtils.asMap("resource_type", "auto"));
        return ResponseEntity.ok(url.values());
    }

}
