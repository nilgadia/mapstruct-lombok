package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FishDto {

    private String kind;

    // make sure that mapping on name does not happen based on name mapping
    private String name;

}
