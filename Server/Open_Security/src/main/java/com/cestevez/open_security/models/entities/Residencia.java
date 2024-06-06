package com.cestevez.open_security.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "residencias")
public class Residencia {

    @Id
    @Column(name = "residencia_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID residencia_id;

    @Column(name = "calle")
    private String calle;

    @Column(name = "pasaje")
    private String pasaje;

    @Column(name = "numeroCasa")
    private String numeroCasa;

    @Column(name = "habitantes")
    private Integer habitantes;

    public Residencia(String calle, String pasaje, String numeroCasa, Integer habitantes) {
        super();
        this.calle = calle;
        this.pasaje = pasaje;
        this.numeroCasa = numeroCasa;
        this.habitantes = habitantes;
    }
}