package org.shahid.jpa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComposedKey {

    private final String name1;
    private final String name2;

    public ComposedKey(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }
}
