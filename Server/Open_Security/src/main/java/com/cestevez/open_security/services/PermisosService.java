package com.cestevez.open_security.services;

import com.cestevez.open_security.models.dtos.RegisterPermisoDTO;
import com.cestevez.open_security.models.entities.Permiso;

import java.util.List;
import java.util.UUID;

public interface PermisosService {
    void PermisoRegister(RegisterPermisoDTO info);
    List<Permiso> getAllPermisos(UUID idResidencia);

}
