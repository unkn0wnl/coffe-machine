package com.innowise.coffeemachine.repository;

import com.innowise.coffeemachine.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink, Long> {
}
