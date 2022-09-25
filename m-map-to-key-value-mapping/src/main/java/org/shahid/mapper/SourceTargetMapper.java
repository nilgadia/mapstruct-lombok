package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.Source;
import org.shahid.dto.Target;
import org.shahid.mapper.util.MappingUtil;

@Mapper(uses = MappingUtil.class)
public interface SourceTargetMapper {

    SourceTargetMapper MAPPER = Mappers.getMapper(SourceTargetMapper.class);

    @Mapping(source = "map", target = "ip", qualifiedBy = MappingUtil.Ip.class)
    @Mapping(source = "map", target = "server", qualifiedBy = MappingUtil.Server.class)
    Target toTarget(Source s);
}
