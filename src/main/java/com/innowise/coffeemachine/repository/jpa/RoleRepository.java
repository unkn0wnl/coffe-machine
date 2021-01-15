package com.innowise.coffeemachine.repository.jpa;

import com.innowise.coffeemachine.entity.jpa.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(Role userRole);
}
