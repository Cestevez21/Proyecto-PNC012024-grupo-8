package com.cestevez.open_security.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Terminal")
public class Terminal {
    @Id
    @Column(name = "terminal_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID terminal_id;
    @Column(name = "tipo_ent_id")
    private UUID tipo_ent_id;
    @Column(name = "fecha_inicio")
    private String fecha_inicio;
    @Column(name = "fecha_final")
    private String fecha_final;

}
