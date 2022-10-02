package shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import shahid.dto.PersonDto;
import shahid.model.Person;

@Mapper
public interface PersonMapper {

    PersonMapper MAPPER = Mappers.getMapper(PersonMapper.class);

    Person toPerson(PersonDto dto);
}