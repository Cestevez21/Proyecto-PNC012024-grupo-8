package com.cestevez.open_security.repositories;

import com.cestevez.open_security.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface UserRepository
        extends JpaRepository<User, UUID> {
    User findOneByEmail(String email);

    User findOneByUsername(String username);

    User findOneByUsernameOrEmail(String username, String email);

}