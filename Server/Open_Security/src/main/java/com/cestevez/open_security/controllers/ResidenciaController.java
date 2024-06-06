package com.cestevez.open_security.controllers;


import com.cestevez.open_security.models.dtos.ResidenciaRegisterDTO;
import com.cestevez.open_security.models.dtos.ResidentesRegisterDTO;
import com.cestevez.open_security.models.entities.Residencia;
import com.cestevez.open_security.models.entities.User;
import com.cestevez.open_security.services.ResidenciaService;
import com.cestevez.open_security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/API/v1/OpenSecurity/residencia")
public class ResidenciaController {

    @Autowired
    private ResidenciaService residenciaService;
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<Object> createResidencia(@RequestBody ResidenciaRegisterDTO info) {
        Residencia residencia = residenciaService.findByNumeroCasa(info.getNumero_casa());

        if(residencia != null){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Residencia already exists");
        }
        residenciaService.registerResidencia(info);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "Response", "Residencia registered successfully",
                "status", HttpStatus.CREATED));
    }

    @PostMapping("/residentes/save")
    public ResponseEntity<Object> createResidente(@RequestBody ResidentesRegisterDTO info) {
        User residente = userService.findOneByIdentifier(info.getIdentifier());
        Residencia residencia = residenciaService.findByNumeroCasa(info.getNumero_casa());

        if(residencia == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Residencia no existe");
        }
        if(residente == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("residente no existe");
        }
        residenciaService.registerResidente(residencia.getResidencia_id(),residente.getUsuario_id(),info.getTipo());
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "Response", "Residencia registered successfully",
                "status", HttpStatus.CREATED));
    }

    @GetMapping("/:numero")
    public ResponseEntity<Object> getResidencebyNumeroCasa(@RequestParam String numero) {
        Residencia residencia = residenciaService.findByNumeroCasa(numero);

        if(residencia == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Residencia no existe");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "Response", "Residencia registered successfully",
                "Residencia", residencia,
                "status", HttpStatus.CREATED));
    }
}
