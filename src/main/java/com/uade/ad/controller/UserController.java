package com.uade.ad.controller;

import com.uade.ad.exception.InternalServerErrorException;
import com.uade.ad.model.Recipe;
import com.uade.ad.model.User;
import com.uade.ad.model.form.LoginForm;
import com.uade.ad.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(summary = "User Login")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Login successful", content = @Content),
            @ApiResponse(responseCode = "404", description = "User not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the login server", content = @Content)
    })
    @PostMapping("/login")
    public User userLogin(@RequestBody LoginForm loginForm){
        User user = userService.findUserByIdUser(1);
        return user;
        // System.out.println("Employee Saved Successfully");
        // if (loginForm.getUsername().contains("user")) throw new InternalServerErrorException();
    }

    @Operation(summary = "User Login")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Login successful", content = @Content),
            @ApiResponse(responseCode = "404", description = "User not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the login server", content = @Content)
    })
    @PostMapping("/recipe")
    public Recipe getRecipe(@RequestBody LoginForm loginForm){
        Recipe recipe = userService.findRecipeByIdRecipe(1);
        return recipe;
        // System.out.println("Employee Saved Successfully");
        // if (loginForm.getUsername().contains("user")) throw new InternalServerErrorException();
    }

/*    @Operation(summary = "User Login")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Login successful", content = @Content),
            @ApiResponse(responseCode = "404", description = "User not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the login server", content = @Content)
    })
    @PostMapping("/logins")
    public ResponseEntity userLogins(@RequestBody LoginForm loginForm){
        // userService.saveUser(user);
        System.out.println("Employee Saved Successfully");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new User());
    }*/
}
