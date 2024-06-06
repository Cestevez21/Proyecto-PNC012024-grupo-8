package com.cestevez.open_security.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "residentes")
public class Residente {
    @Id
    @Column(name = "idResidencia")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idResidencia;
    @Column(name = "idResidente")
    private UUID idResidente;
    @Column(name = "tipo")
    private String tipo;

    public Residente(UUID idResidencia, UUID idResidente, String tipo) {
        this.idResidencia = idResidencia;
        this.idResidente = idResidente;
        this.tipo = tipo;
    }
}
