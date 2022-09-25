package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.FishTankDto;
import org.shahid.model.FishTank;


@Mapper
public interface FishTankMapperExpression {

    FishTankMapperExpression INSTANCE = Mappers.getMapper(FishTankMapperExpression.class);

    @Mapping(target = "fish.kind", source = "fish.type")
    @Mapping(target = "fish.name", expression = "java(\"Jaws\")")
    @Mapping(target = "plant", ignore = true)
    @Mapping(target = "ornament", ignore = true)
    @Mapping(target = "material", ignore = true)
    @Mapping(target = "quality.report.organisation.name", expression = "java(\"Dunno\")")
    FishTankDto map(FishTank source);

}
