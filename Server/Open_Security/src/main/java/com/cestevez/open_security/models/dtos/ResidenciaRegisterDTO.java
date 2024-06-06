package com.cestevez.open_security.models.dtos;

import lombok.Data;

@Data
public class ResidenciaRegisterDTO {
    private String calle;
    private String pasaje;
    private String numero_casa;
    private Integer numero_habitantes;
}
