package com.cestevez.open_security.services;

import com.cestevez.open_security.models.dtos.ResidenciaRegisterDTO;
import com.cestevez.open_security.models.dtos.ResidentesRegisterDTO;
import com.cestevez.open_security.models.entities.Residencia;
import com.cestevez.open_security.models.entities.Residente;

import java.util.List;
import java.util.UUID;


public interface ResidenciaService {
    void registerResidencia(ResidenciaRegisterDTO info);
    void registerResidente(UUID residencia_id, UUID residente_id,String tipo);
    Residencia findByNumeroCasa(String Numero);
    List<Residente> findAllbyResidencia(UUID idResidencia);
    Residente findResidenciaByResidente(UUID usuarioId);
}
