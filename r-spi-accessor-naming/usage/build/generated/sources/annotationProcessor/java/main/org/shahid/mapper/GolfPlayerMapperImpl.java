package org.shahid.mapper;

import javax.annotation.processing.Generated;
import org.shahid.dto.GolfPlayer;
import org.shahid.dto.GolfPlayerDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-25T13:52:07+0300",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
public class GolfPlayerMapperImpl implements GolfPlayerMapper {

    @Override
    public GolfPlayerDto toDto(GolfPlayer player) {
        if ( player == null ) {
            return null;
        }

        GolfPlayerDto golfPlayerDto = new GolfPlayerDto();

        return golfPlayerDto;
    }

    @Override
    public GolfPlayer toPlayer(GolfPlayerDto player) {
        if ( player == null ) {
            return null;
        }

        GolfPlayer golfPlayer = new GolfPlayer();

        return golfPlayer;
    }
}
