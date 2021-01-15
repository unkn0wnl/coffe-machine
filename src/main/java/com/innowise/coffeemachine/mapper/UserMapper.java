package com.innowise.coffeemachine.mapper;

import com.innowise.coffeemachine.dto.UserDto;
import com.innowise.coffeemachine.entity.jpa.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto(User user);

}
