package com.uade.ad.controller;

import com.uade.ad.controller.dto.in.*;
import com.uade.ad.exception.UserErrorException;
import com.uade.ad.model.User;
import com.uade.ad.service.MailService;
import com.uade.ad.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    private final MailService mailService;

    public UserController(UserService userService, MailService mailService) {
        this.userService = userService;
        this.mailService = mailService;
    }

    @Operation(summary = "User Login")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Login successful", content = @Content),
            @ApiResponse(responseCode = "404", description = "User not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @PostMapping("/login")
    public ResponseEntity userLogin(@RequestBody LoginForm loginForm){
        if(!userService.isExistingUser(loginForm.getUsername(), loginForm.getPassword())) {
            throw new UserErrorException();
        }
        return ResponseEntity.ok(userService.findUserByUsername(loginForm.getUsername()));
    }

    @Operation(summary = "Request Password Reset Email")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Password reset code sent", content = @Content),
            @ApiResponse(responseCode = "404", description = "User not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @PostMapping("/requestPasswordReset")
    public ResponseEntity requestPasswordReset(@RequestBody RequestPasswordResetForm requestPasswordResetForm){

        Integer token = userService.generateToken(requestPasswordResetForm.getEmail());

        mailService.sendEmail(requestPasswordResetForm.getEmail(), token);

        return ResponseEntity.ok(token);
    }

    @Operation(summary = "Reset password")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Password reset successful", content = @Content),
            @ApiResponse(responseCode = "404", description = "User not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @PostMapping("/passwordReset")
    public ResponseEntity resetPassword(@RequestBody PasswordResetForm resetForm){
        userService.resetPassword(resetForm.getEmail(), resetForm.getResetToken(), resetForm.getNewPassword());

        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Create account")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "New account successfully registered", content = @Content),
            @ApiResponse(responseCode = "404", description = "User not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @PostMapping("/createAccount")
    public ResponseEntity createAccount(@RequestBody RegisterForm registerForm){
        userService.createUser(registerForm.getEmail(), registerForm.getUsername(), registerForm.getPassword());

        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Add account details")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "New account successfully registered", content = @Content),
            @ApiResponse(responseCode = "404", description = "User not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @PostMapping("/addAccountDetails")
    public ResponseEntity addAccountDetails(@RequestBody AddAccountDetailsForm form){

        userService.addUserDetails(form.getEmail(),
                form.getFirstName(),
                form.getLastName(),
                form.getAge(),
                form.getCountry());

        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Add favorite recipe")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "New favorite recipe successfully registered", content = @Content),
            @ApiResponse(responseCode = "404", description = "User or recipe not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @PostMapping("/favoriteRecipe")
    public ResponseEntity addFavoriteRecipe(@RequestBody FavoriteRecipeForm favoriteRecipeForm){
        userService.addFavoriteRecipe(favoriteRecipeForm.getIdUser(), favoriteRecipeForm.getIdRecipe());
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get favorite recipes")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Favorite recipes successfully retrieved", content = @Content),
            @ApiResponse(responseCode = "404", description = "User not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @GetMapping("/favoriteRecipe/{userId}")
    public ResponseEntity getFavoriteRecipe(@PathVariable int userId){

        return ResponseEntity.ok(userService.getFavoriteRecipes(userId));
    }

    @Operation(summary = "Delete favorite recipes")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Favorite recipes successfully deleted", content = @Content),
            @ApiResponse(responseCode = "404", description = "User or recipe not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Error in the server", content = @Content)
    })
    @DeleteMapping("/favoriteRecipe")
    public ResponseEntity deleteFavoriteRecipe(@RequestBody FavoriteRecipeForm favoriteRecipeForm){
        userService.deleteFavoriteRecipe(favoriteRecipeForm.getIdUser(), favoriteRecipeForm.getIdRecipe());
        return ResponseEntity.ok().build();
    }
}
