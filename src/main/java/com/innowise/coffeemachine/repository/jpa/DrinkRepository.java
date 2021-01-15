package com.innowise.coffeemachine.repository.jpa;

import com.innowise.coffeemachine.entity.jpa.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
}
