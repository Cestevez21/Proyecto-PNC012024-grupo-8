package com.cestevez.open_security.repositories;

import com.cestevez.open_security.models.entities.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TerminalRepository extends JpaRepository<Terminal, Long> {
}
