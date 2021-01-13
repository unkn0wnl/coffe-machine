package com.innowise.coffeemachine.dto;


import com.innowise.coffeemachine.entity.CardAccount;
import com.innowise.coffeemachine.entity.Order;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {

    private Long id;

    private String firstName;
    private String surname;

    private String email;

    private List<CardAccount> cardAccount;
    private List<Order> orderDrink;

}
