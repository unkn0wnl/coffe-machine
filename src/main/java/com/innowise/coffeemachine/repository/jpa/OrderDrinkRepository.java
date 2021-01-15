package com.innowise.coffeemachine.repository.jpa;

import com.innowise.coffeemachine.entity.jpa.OrderDrink;
import com.innowise.coffeemachine.entity.jpa.OrderDrinkPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDrinkRepository extends JpaRepository<OrderDrink, OrderDrinkPK> {
}
