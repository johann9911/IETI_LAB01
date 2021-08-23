package edu.eci.laboratorio01_RestFull.mapper;

import edu.eci.laboratorio01_RestFull.data.User;
import edu.eci.laboratorio01_RestFull.dto.UserDto;

public class MapperClasses {

    public static User toUser(UserDto userDto){
        return new User(userDto.getName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getCreatedAt()
        );
    }
}
