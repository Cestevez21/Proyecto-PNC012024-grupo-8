package com.cestevez.open_security.repositories;

import com.cestevez.open_security.models.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
