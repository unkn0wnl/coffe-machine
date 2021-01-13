package com.innowise.coffeemachine.dto;

import com.innowise.coffeemachine.entity.Addition;
import com.innowise.coffeemachine.entity.DrinkSize;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class DrinkDto {

    private Long id;

    private String title;
    private BigDecimal price;

    private Integer servingNumber;
    private DrinkSize drinkSize;

    private List<Addition> additionList;

}
