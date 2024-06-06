package com.cestevez.open_security.controllers;

import com.cestevez.open_security.models.entities.Permiso;
import com.cestevez.open_security.models.entities.Residencia;
import com.cestevez.open_security.models.entities.Residente;
import com.cestevez.open_security.models.entities.User;
import com.cestevez.open_security.services.PermisosService;
import com.cestevez.open_security.services.ResidenciaService;
import com.cestevez.open_security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/API/v1/OpenSecurity/permisos")
public class PermisosController {
    @Autowired
    private PermisosService permisosService;
    @Autowired
    private UserService userService;
    @Autowired
    private ResidenciaService residenciaService;

    @PostMapping("/save")
    public ResponseEntity<Object> RegisterPermisos() {

        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "Response", "Permiso registered successfully",
                "status", HttpStatus.OK));
    }
    @GetMapping("/")
    public ResponseEntity<Object> getAllPermisos() {
        User user = userService.findUserAuthenticated();
        //Residente residencia = residenciaService.findResidenciaByResidente(user.getUsuario_id());
        //List<Permiso> permisos = permisosService.getAllPermisos(residencia.getId_residencia());
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "Response", "Permisos Encontrados",
               // "Permisos", permisos,
                "status", HttpStatus.OK));
    }
}
