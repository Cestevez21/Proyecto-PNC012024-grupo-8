package com.cestevez.open_security.repositories;

import com.cestevez.open_security.models.entities.Token;
import com.cestevez.open_security.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TokenRepository
        extends JpaRepository<Token, UUID> {

    List<Token> findByUserAndActive(User user, Boolean active);
}
