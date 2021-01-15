package com.innowise.coffeemachine.dto;

import com.innowise.coffeemachine.entity.jpa.OrderStatus;

import java.time.LocalDate;

public class OrderDto {

    private Long id;

    private LocalDate creationDate;
    private OrderStatus orderStatus;

}
