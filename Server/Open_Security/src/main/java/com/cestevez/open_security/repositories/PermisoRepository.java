package com.cestevez.open_security.repositories;

import com.cestevez.open_security.models.dtos.RegisterPermisoDTO;
import com.cestevez.open_security.models.entities.Permiso;

import com.cestevez.open_security.models.entities.Residencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PermisoRepository extends JpaRepository<Permiso, UUID> {
    //List<Permiso> findByResidencia_id(Residencia residencia);
}

