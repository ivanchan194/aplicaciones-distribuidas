package com.uade.ad.repository;

import com.uade.ad.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByIdUser(int id);

    User findUserByNickname(String nickname);

    User findUserByEmail(String email);
}
