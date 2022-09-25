package org.shahid.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.Source;
import org.shahid.dto.Target;
import org.shahid.mapper.util.RoundingUtil;


@Mapper(uses = RoundingUtil.class)
public interface SourceTargetMapper {

    SourceTargetMapper MAPPER = Mappers.getMapper(SourceTargetMapper.class);

    @Mapping(target = "bd2", qualifiedBy = RoundingUtil.Fraction2.class)
    @Mapping(target = "bd3", qualifiedBy = RoundingUtil.Fraction3.class)
    @Mapping(target = "bdUnConstrained")
    Target toTarget(Source s);
}
