package com.uade.ad.service;

import com.uade.ad.model.Recipe;
import com.uade.ad.model.User;
import java.util.Set;

public interface UserService {
    void saveUser(User user);

    User findUserByIdUser(int i);

    boolean isExistingUser(String username, String password);

    User findUserByUsername(String username);

    Integer generateToken(String email);

    void resetPassword(String email, Integer resetToken, String newPassword);

    void createUser(String email, String username, String password);

    void addUserDetails(String email, String firstName, String lastName, Integer age, String country);

    void addFavoriteRecipe(int idUser, int idRecipe);

    Set<Recipe> getFavoriteRecipes(int idUser);

    void deleteFavoriteRecipe(int idUser, int idRecipe);

    User getUser(int i);
}
