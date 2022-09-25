package org.shahid.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.MammalDto;
import org.shahid.dto.MammalEntity;

@Mapper
public interface SourceTargetMapper {

    SourceTargetMapper MAPPER = Mappers.getMapper(SourceTargetMapper.class);

    @Mapping(target = "numberOfStomachs", source = "numberOfStomachs")
    void toTarget(MammalDto source, Long numberOfStomachs, @MappingTarget MammalEntity target);
}
