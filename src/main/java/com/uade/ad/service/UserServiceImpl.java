package com.uade.ad.service;

import com.uade.ad.exception.InternalServerErrorException;
import com.uade.ad.exception.UserErrorException;
import com.uade.ad.model.Recipe;
import com.uade.ad.model.User;
import com.uade.ad.model.UserDetails;
import com.uade.ad.repository.RecipeRepository;
import com.uade.ad.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

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

        return user != null && user.getUserDetails().getPassword().equals(password);
    }

    @Override
    public Integer generateToken(String email) {
        User user = userRepository.findUserByEmail(email);
        int token;
        if(!(user == null)) {
            Random random = new Random();
            token = random.nextInt(10000-1000) + 1000;
            user.getUserDetails().setResetToken(token);
            userRepository.save(user);
        } else {
            throw new UserErrorException();
        }
        return token;
    }

    @Override
    public void resetPassword(String email, Integer resetToken, String newPassword) {
        User user = userRepository.findUserByEmail(email);

        if (user != null && user.getUserDetails().getResetToken().equals(resetToken)) {
            user.getUserDetails().setResetToken(null);
            user.getUserDetails().setPassword(newPassword);
            userRepository.save(user);
        } else {
            throw new UserErrorException();
        }
    }

    @Override
    public void createUser(String email, String username) {
        try{
            User user = User.builder().setEmail(email).setNickname(username).build();
            userRepository.save(user);
        } catch (Exception e) {
            throw new InternalServerErrorException();
        }

    }

    @Override
    public void addUserDetails(String email, String password, String firstName, String lastName, Integer age, String country) {
        try {
            User user = userRepository.findUserByEmail(email);
            if (user != null) {
                UserDetails userDetails = UserDetails.builder()
                        .setAge(age)
                        .setCountry(country)
                        .setPassword(password)
                        .setUser(user).build();
                user.setUserDetails(userDetails);
                user.setName(firstName + " " + lastName);

                userRepository.save(user);
            }
        } catch (Exception e) {
            throw  new InternalServerErrorException();
        }
    }
}
