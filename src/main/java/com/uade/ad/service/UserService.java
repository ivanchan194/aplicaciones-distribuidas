package com.uade.ad.service;

import com.uade.ad.model.Recipe;
import com.uade.ad.model.User;

public interface UserService {
    void saveUser(User user);

    User findUserByIdUser(int i);

    boolean isExistingUser(String username, String password);

    Integer generateToken(String email);

    void resetPassword(String email, Integer resetToken, String newPassword);

    void createUser(String email, String username, String password);

    void addUserDetails(String email, String firstName, String lastName, Integer age, String country);
}
