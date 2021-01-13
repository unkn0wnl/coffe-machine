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
public class AdditionDto {

    private Long id;

    private String title;
    private BigDecimal price;

}
