package com.innowise.coffeemachine.mapper;

import com.innowise.coffeemachine.dto.DrinkDto;
import com.innowise.coffeemachine.entity.Drink;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DrinkMapper {

    DrinkMapper DRINK_MAPPER = Mappers.getMapper(DrinkMapper.class);

    DrinkDto drinkToDrinkDto(Drink drink);

    Drink drinkDtoToDrink(DrinkDto drinkDto);
}
