package com.cestevez.open_security.services.Implementations;

import com.cestevez.open_security.models.dtos.RegisterPermisoDTO;
import com.cestevez.open_security.models.entities.Permiso;
import com.cestevez.open_security.repositories.PermisoRepository;
import com.cestevez.open_security.services.PermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PermisosImplementation implements PermisosService {

    @Autowired
    private PermisoRepository permisoRepository;

    @Override
    public void PermisoRegister(RegisterPermisoDTO info) {


    }

    @Override
    public List<Permiso> getAllPermisos(UUID idResidencia) {
        return List.of();
    }

    //@Override
    //public List<Permiso> getAllPermisos(UUID residencia_id) {
        //return permisoRepository.findByResidencia_id();
    //}
}
