package com.cestevez.open_security.services;

import com.cestevez.open_security.models.entities.Entrada;

import java.util.List;

public interface EntradaService {
    List<Entrada> findAll();
}
