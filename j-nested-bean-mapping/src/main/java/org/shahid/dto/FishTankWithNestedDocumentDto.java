package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FishTankWithNestedDocumentDto {

    private FishDto fish;
    private WaterPlantDto plant;
    private String name;
    private MaterialDto material;
    private OrnamentDto ornament;
    private WaterQualityWithDocumentDto quality;
}
