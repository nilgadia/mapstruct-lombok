package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.control.DeepClone;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.CustomerDto;

@Mapper(mappingControl = DeepClone.class)
public interface Cloner {

    Cloner MAPPER = Mappers.getMapper(Cloner.class);

    CustomerDto clone(CustomerDto customerDto);
}
