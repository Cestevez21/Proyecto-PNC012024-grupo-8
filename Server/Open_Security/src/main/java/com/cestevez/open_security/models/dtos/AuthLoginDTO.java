package com.cestevez.open_security.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AuthLoginDTO {
    @NotEmpty
    private String identifier;

    @NotEmpty
    private String password;
}