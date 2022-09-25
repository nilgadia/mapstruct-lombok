package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.GolfPlayer;
import org.shahid.dto.GolfPlayerDto;

@Mapper
public interface GolfPlayerMapper {

    GolfPlayerMapper INSTANCE = Mappers.getMapper( GolfPlayerMapper.class );

    GolfPlayerDto toDto(GolfPlayer player);

    GolfPlayer toPlayer(GolfPlayerDto player);

}
