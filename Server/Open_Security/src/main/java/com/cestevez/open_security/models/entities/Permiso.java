package com.cestevez.open_security.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "permisos")
public class Permiso {
    @Id
    @Column(name = "permiso_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID permiso_id;
    @Column(name = "usuario_id")
    private UUID usuario_id;
    @Column(name = "residencia_id")
    private UUID residencia_id;
    @Column(name = "contador_usos")
    private Integer contador_usos;
    @Column(name = "duracion")
    private Integer duracion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "detalle")
    private String detalle;
    @Column(name = "fechaHora")
    private String fechaHora;

    public Permiso(UUID usuario_id,UUID residencia_id,Integer contador_usos,Integer duracion,Boolean estado,String detalle,String fechaHora) {
        super();
        this.usuario_id = usuario_id;
        this.residencia_id = residencia_id;
        this.contador_usos = contador_usos;
        this.duracion = duracion;
        this.estado = estado;
        this.detalle = detalle;
        this.fechaHora = fechaHora;
    }
}
