package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;


@Getter
@Setter
public class Source {
    private Map<String, Object> map;

    public Source(Map<String, Object> map) {
        this.map = map;
    }
}
