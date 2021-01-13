package com.innowise.coffeemachine.repository;

import com.innowise.coffeemachine.entity.Role;
import com.innowise.coffeemachine.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(UserRole userRole);
}