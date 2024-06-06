package com.cestevez.open_security.services.Implementations;

import com.cestevez.open_security.models.dtos.ResidenciaRegisterDTO;
import com.cestevez.open_security.models.entities.Residencia;
import com.cestevez.open_security.models.entities.Residente;
import com.cestevez.open_security.repositories.ResidenciaRepository;
import com.cestevez.open_security.repositories.ResidentesRepository;
import com.cestevez.open_security.services.ResidenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ResidenciaImplementation implements ResidenciaService {

    @Autowired
    ResidenciaRepository residenciaRepository;
    @Autowired
    ResidentesRepository residentesRepository;

    @Override
    public void registerResidencia(ResidenciaRegisterDTO info) {
        Residencia Residencia = new Residencia(
                info.getCalle(),
                info.getPasaje(),
                info.getNumero_casa(),
                info.getNumero_habitantes()
        );
        residenciaRepository.save(Residencia);
    }

    @Override
    public void registerResidente(UUID residencia_id, UUID residente_id,String tipo) {
        Residente Residente = new Residente(
                residencia_id,
                residente_id,
                tipo
        );
        residentesRepository.save(Residente);
    }

    @Override
    public Residencia findByNumeroCasa(String Numero) {
        //Residencia residencia = residenciaRepository.findByNumeroCasa(Numero);
        return residenciaRepository.findBynumeroCasa(Numero);
    }

    @Override
    public List<Residente> findAllbyResidencia(UUID idResidencia) {
        return List.of();
    }

    @Override
    public Residente findResidenciaByResidente(UUID idResidente) {
        return residentesRepository.findResidenciaByidResidente(idResidente);
    }
}
