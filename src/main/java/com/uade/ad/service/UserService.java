package com.uade.ad.service;

import com.uade.ad.model.User;

public interface UserService {
    void saveUser(User user);

    User findUserByIdUser(int i);
}
