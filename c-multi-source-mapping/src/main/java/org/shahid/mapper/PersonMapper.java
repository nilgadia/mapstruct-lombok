package org.shahid.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.PersonDto;
import org.shahid.model.Contact;
import org.shahid.model.Name;

@Mapper
public interface PersonMapper {
    PersonMapper MAPPER = Mappers.getMapper(PersonMapper.class);

    @BeanMapping(ignoreByDefault = false)
    PersonDto toDto(Name name, Contact contact);

    @Mappings({
            @Mapping(source = "name.firstname", target = "firstName"),
            @Mapping(source = "name.lastname", target = "lastName"),
            // @Mapping(source = "contact.phoneNumber", target = "phoneNumber"),
            // @Mapping(source = "contact.mobileNumber", target = "mobileNumber")
    })
    PersonDto toPersonDto(Name name, Contact contact);
}
