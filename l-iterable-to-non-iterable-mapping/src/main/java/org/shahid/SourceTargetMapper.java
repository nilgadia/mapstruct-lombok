package org.shahid;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.shahid.util.FirstElement;
import org.shahid.util.IterableNonIterableUtil;
import org.shahid.util.LastElement;


@Mapper(uses = IterableNonIterableUtil.class)
public interface SourceTargetMapper {

    SourceTargetMapper MAPPER = Mappers.getMapper(SourceTargetMapper.class);

    @Mapping(source = "myIntegers", target = "myInteger", qualifiedBy = FirstElement.class)
    @Mapping(source = "myStrings", target = "myString", qualifiedBy = LastElement.class)
    Target toTarget(Source s);
}
