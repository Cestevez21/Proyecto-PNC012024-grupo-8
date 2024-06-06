package com.cestevez.open_security.repositories;

import com.cestevez.open_security.models.entities.Entrada;
import com.cestevez.open_security.models.entities.Residente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EntradaRepository extends JpaRepository<Entrada, UUID> {
    List<Entrada> findAll();
    //List<Entrada> findByResidente(Residente residente);
}
