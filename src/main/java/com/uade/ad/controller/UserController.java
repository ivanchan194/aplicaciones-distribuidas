package com.uade.ad.controller;

import com.uade.ad.exception.UserErrorException;
import com.uade.ad.model.User;
import com.uade.ad.controller.dto.in.LoginForm;
import com.uade.ad.controller.dto.in.PasswordResetForm;
import com.uade.ad.controller.dto.in.RegisterForm;
import com.uade.ad.controller.dto.in.RequestPasswordResetForm;
import com.uade.ad.controller.dto.in.AddAccountDetailsForm;
import com.uade.ad.service.MailService;
import com.uade.ad.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return ResponseEntity.ok().build();
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
}
