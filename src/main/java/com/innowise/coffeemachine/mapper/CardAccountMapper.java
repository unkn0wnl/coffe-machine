package com.innowise.coffeemachine.mapper;

import com.innowise.coffeemachine.dto.CardAccountDto;
import com.innowise.coffeemachine.entity.CardAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardAccountMapper {

    CardAccountDto cardAccountToCardAccountDto(CardAccount cardAccount);

    CardAccount cardAccountDtoToCardAccount(CardAccountDto cardAccountDto);

}
