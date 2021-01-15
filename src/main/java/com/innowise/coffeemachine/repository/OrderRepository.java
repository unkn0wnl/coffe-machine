package com.innowise.coffeemachine.repository;

import com.innowise.coffeemachine.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "SELECT user_order FROM Order user_order WHERE user_order.user.id = :userId")
    List<Order> findOrdersByUserId(@Param(value = "userId") Long userId);
}
