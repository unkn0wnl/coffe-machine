package com.innowise.coffeemachine.mapper;

import com.innowise.coffeemachine.dto.UserDto;
import com.innowise.coffeemachine.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);

    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto(User user);

}
