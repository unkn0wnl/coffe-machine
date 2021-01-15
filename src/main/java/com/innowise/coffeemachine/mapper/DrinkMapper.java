package com.innowise.coffeemachine.mapper;

import com.innowise.coffeemachine.dto.DrinkDto;
import com.innowise.coffeemachine.entity.jpa.Drink;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DrinkMapper {

    DrinkDto drinkToDrinkDto(Drink drink);

    Drink drinkDtoToDrink(DrinkDto drinkDto);
}
