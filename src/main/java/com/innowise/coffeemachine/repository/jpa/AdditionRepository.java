package com.innowise.coffeemachine.repository.jpa;

import com.innowise.coffeemachine.entity.Addition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdditionRepository extends JpaRepository<Addition, Long> {
}