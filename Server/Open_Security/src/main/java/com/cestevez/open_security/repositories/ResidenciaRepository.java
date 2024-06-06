package com.cestevez.open_security.repositories;

import com.cestevez.open_security.models.entities.Residencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ResidenciaRepository extends JpaRepository<Residencia, UUID> {
    Residencia findBynumeroCasa(String numero_casa);
}
