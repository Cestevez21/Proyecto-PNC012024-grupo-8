package com.cestevez.open_security.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class ResidentesRegisterDTO {
    @NotEmpty(message = "identifier vacío")
    private String identifier;
    @NotEmpty(message = "numero casa vacío")
    private String numero_casa;
    @NotEmpty(message = "tipo residente vacío")
    private String tipo;
}
