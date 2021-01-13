package com.innowise.coffeemachine.mapper;

import com.innowise.coffeemachine.dto.CardAccountDto;
import com.innowise.coffeemachine.entity.CardAccount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CardAccountMapper {

    CardAccountMapper CARD_ACCOUNT_MAPPER = Mappers.getMapper(CardAccountMapper.class);

    CardAccountDto cardAccountToCardAccountDto(CardAccount cardAccount);

    CardAccount cardAccountDtoToCardAccount(CardAccountDto cardAccountDto);

}
