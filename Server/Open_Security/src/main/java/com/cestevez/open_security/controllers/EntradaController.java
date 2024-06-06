package com.cestevez.open_security.controllers;

import com.cestevez.open_security.models.entities.Entrada;
import com.cestevez.open_security.services.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/API/v1/OpenSecurity/entradas")
public class EntradaController {
    @Autowired
    private EntradaService entradaService;

    @GetMapping("/")
    public ResponseEntity<Object> findAllEntradas(){
        List<Entrada> entradas = entradaService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "Response", "Residencia registered successfully",
                "Entradas", entradas,
                "status", HttpStatus.OK));
    }

}
