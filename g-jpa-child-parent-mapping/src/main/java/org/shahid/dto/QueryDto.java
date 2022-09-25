package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QueryDto {

    private String name;

    private List<InputDto> inputs;

    private List<OutputDto> outputs;
}
