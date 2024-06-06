package com.cestevez.open_security.services.Implementations;

import com.cestevez.open_security.models.entities.Entrada;
import com.cestevez.open_security.repositories.EntradaRepository;
import com.cestevez.open_security.services.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntradasImplementation implements EntradaService {

    @Autowired
    private EntradaRepository entradaRepository;

    @Override
    public List<Entrada> findAll() {
        return entradaRepository.findAll();
    }
}
