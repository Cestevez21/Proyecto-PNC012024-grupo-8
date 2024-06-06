package com.cestevez.open_security.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "roles_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID roles_id;
    @Column(name = "role")
    private String role;
}
