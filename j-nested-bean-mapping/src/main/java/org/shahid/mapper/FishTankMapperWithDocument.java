package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.FishTankWithNestedDocumentDto;
import org.shahid.model.FishTank;

@Mapper
public interface FishTankMapperWithDocument {

    FishTankMapperWithDocument INSTANCE = Mappers.getMapper(FishTankMapperWithDocument.class);

    @Mapping(target = "fish.kind", source = "fish.type")
    @Mapping(target = "fish.name", expression = "java(\"Jaws\")")
    @Mapping(target = "plant", ignore = true)
    @Mapping(target = "ornament", ignore = true)
    @Mapping(target = "material", ignore = true)
    @Mapping(target = "quality.document", source = "quality.report")
    @Mapping(target = "quality.document.organisation.name", constant = "NoIdeaInc")
    FishTankWithNestedDocumentDto map(FishTank source);

}
