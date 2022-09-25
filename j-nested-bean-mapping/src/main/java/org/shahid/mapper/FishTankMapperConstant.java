package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.FishTankDto;
import org.shahid.model.FishTank;

@Mapper
public interface FishTankMapperConstant {

    FishTankMapperConstant INSTANCE = Mappers.getMapper(FishTankMapperConstant.class);

    @Mapping(target = "fish.kind", source = "fish.type")
    @Mapping(target = "fish.name", constant = "Nemo")
    @Mapping(target = "ornament", ignore = true)
    @Mapping(target = "material.materialType", source = "material")
    @Mapping(target = "material.manufacturer", constant = "MMM")
    @Mapping(target = "quality", ignore = true)
    FishTankDto map(FishTank source);

}
