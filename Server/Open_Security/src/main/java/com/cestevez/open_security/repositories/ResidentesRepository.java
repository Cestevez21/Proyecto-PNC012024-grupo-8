package com.cestevez.open_security.repositories;

import com.cestevez.open_security.models.entities.Residente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ResidentesRepository extends JpaRepository<Residente, UUID>  {
    List<Residente> findByidResidencia(UUID idResidencia);
    Residente findResidenciaByidResidente(UUID idResidente);
}
