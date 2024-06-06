package com.cestevez.open_security.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "entradas")
public class Entrada {
    @Id
    @Column(name = "entrada_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID entrada_id;
    @Column(name = "tipo_entrada")
    private String tipo_entrada;
    @Column(name = "fecha_hora")
    private String fecha_hora;
    @Column(name = "QR")
    private UUID QR;
    @Column(name = "observaciones")
    private String Observaciones;

    public Entrada(String tipo_entrada, String fecha_hora, UUID QR, String observaciones) {
        super();
        this.tipo_entrada = tipo_entrada;
        this.fecha_hora = fecha_hora;
        this.QR = QR;
        this.Observaciones = observaciones;
    }
}
