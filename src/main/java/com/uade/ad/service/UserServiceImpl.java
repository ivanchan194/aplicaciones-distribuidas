package com.uade.ad.service;

import com.uade.ad.model.Recipe;
import com.uade.ad.model.User;
import com.uade.ad.repository.RecipeRepository;
import com.uade.ad.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    private final RecipeRepository recipeRepository;

    public UserServiceImpl(UserRepository userRepository, RecipeRepository recipeRepository) {
        this.userRepository = userRepository;
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User findUserByIdUser(int id) {
        return userRepository.findUserByIdUser(1);
    }

    @Override
    public Recipe findRecipeByIdRecipe(int i) {
        return recipeRepository.findRecipeByIdRecipe(i);
    }

    @Override
    public boolean isExistingUser(String username, String password) {
        User user = userRepository.findUserByNickname(username);

        return (user != null && user.getUserDetails().getPassword().equals(password)) ? true : false;
    }
}
