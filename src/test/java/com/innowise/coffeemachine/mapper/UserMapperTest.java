package com.innowise.coffeemachine.mapper;

import com.innowise.coffeemachine.dto.UserDto;
import com.innowise.coffeemachine.entity.Order;
import com.innowise.coffeemachine.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ContextConfiguration(classes = {UserMapperImpl.class})
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void userDtoToUser() {

        UserDto userDto = new UserDto() {{
            setId(1L);
            setEmail("mail");
            setFirstName("name");
            setSurname("surname");
            setOrderDrink(Arrays.asList(new Order(), new Order()));
        }};

        User user = userMapper.userDtoToUser(userDto);

        assertEquals(new User() {{
            setId(userDto.getId());
            setEmail(userDto.getEmail());
            setFirstName(user.getFirstName());
            setSurname(user.getSurname());
            setOrderDrink(user.getOrderDrink());
        }}, user);

    }

    @Test
    void userToUserDto() {
    }
}