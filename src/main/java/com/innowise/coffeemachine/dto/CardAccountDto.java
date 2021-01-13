package com.innowise.coffeemachine.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class CardAccountDto {

    private Long id;

    private String cardNumber;
    private BigDecimal amount;

}
