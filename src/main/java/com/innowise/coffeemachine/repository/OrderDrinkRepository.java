package com.innowise.coffeemachine.repository;

import com.innowise.coffeemachine.entity.OrderDrink;
import com.innowise.coffeemachine.entity.OrderDrinkPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDrinkRepository extends JpaRepository<OrderDrink, OrderDrinkPK> {
}
