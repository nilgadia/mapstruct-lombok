package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.ExternalPerson;
import org.shahid.model.Person;

@Mapper
public interface PersonMapper {

    PersonMapper MAPPER = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "firstName", source = "personFirstName")
    @Mapping(target = "lastName", source = "personLastName")
    Person toPerson(ExternalPerson externalPerson);
}