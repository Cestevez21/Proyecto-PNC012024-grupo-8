package com.cestevez.open_security.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class RegisterPermisoDTO {
    @NotEmpty
    private Integer contador_usos;
    @NotEmpty
    private Integer duracion;
    @NotEmpty
    private Boolean estado;
    @NotEmpty
    private String detalle;
    @NotEmpty
    private String fechaHora;
}
