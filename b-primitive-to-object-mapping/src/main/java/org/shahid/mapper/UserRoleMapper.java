package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.UserRoleDto;

@Mapper
public interface UserRoleMapper {
    UserRoleMapper MAPPER = Mappers.getMapper(UserRoleMapper.class);

    UserRoleDto toDto(Integer userId, Integer roleId);

    @Mappings({
            @Mapping(source = "usrId", target = "userId"),
            @Mapping(source = "id", target = "roleId"),
    })
    UserRoleDto toUserRoleDto(Integer usrId, Integer id);
}
