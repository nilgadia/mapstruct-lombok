package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FishTankWithVolumeDto {
    FishDto fish;
    MaterialDto material;
    WaterQualityDto quality;
    VolumeDto volume;
}