package org.shahid.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.UserDto;
import org.shahid.model.Authority;
import org.shahid.model.User;

import java.util.List;
import java.util.Set;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(source = "fullName", target = "name"),
            @Mapping(target = "address", expression = "java(user.getAddress().toString())")
    })
    UserDto userToDto(User user);

    @IterableMapping(elementTargetType = String.class)
    Set<String> mapListToSet(List<Authority> value);

    default String mapAuthorityToString(Authority authority) {
        return authority.getValue();
    }
}