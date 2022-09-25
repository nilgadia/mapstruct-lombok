package org.shahid.mapper;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.InputDto;
import org.shahid.dto.OutputDto;
import org.shahid.dto.QueryDto;
import org.shahid.model.Input;
import org.shahid.model.Output;
import org.shahid.model.Query;
import org.shahid.model.QueryMapperJpaContext;

@Mapper
public interface QueryMapper {

    QueryMapper INSTANCE = Mappers.getMapper(QueryMapper.class);

    Query toEntity(QueryDto dto, @Context QueryMapperJpaContext ctx);

    @Mapping(target = "query", ignore = true)
    Input toEntity(InputDto dto, @Context QueryMapperJpaContext ctx);

    @Mapping(target = "query", ignore = true)
    Output toEntity(OutputDto dto, @Context QueryMapperJpaContext ctx);
}
