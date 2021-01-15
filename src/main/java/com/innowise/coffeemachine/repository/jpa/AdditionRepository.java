package com.innowise.coffeemachine.repository.jpa;

import com.innowise.coffeemachine.entity.jpa.Addition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionRepository extends JpaRepository<Addition, Long> {
}
