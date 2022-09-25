package org.shahid.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FishTank {

    private Fish fish;
    private WaterPlant plant;
    private String name;
    private MaterialType material;
    private Interior interior;
    private WaterQuality quality;
}
