package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.shahid.dto.FishTankWithVolumeDto;
import org.shahid.dto.VolumeDto;
import org.shahid.model.FishTank;

@Mapper
public interface FishTankMapperWithVolume {

    @Mapping(target = "fish.kind", source = "source.fish.type")
    @Mapping(target = "material.materialType", source = "source.material")
    @Mapping(target = "quality.report", source = "source.quality.report")
    @Mapping(target = "volume", source = "source")
    FishTankWithVolumeDto map(FishTank source);

    default VolumeDto mapVolume(FishTank source) {
        int volume = source.getHeight() * source.getWidth() * source.getHeight();
        String desc = volume < 100 ? "Small" : "Large";
        return new VolumeDto(volume, desc);
    }
}