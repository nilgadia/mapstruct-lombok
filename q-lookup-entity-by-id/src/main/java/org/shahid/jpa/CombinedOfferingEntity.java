package org.shahid.jpa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CombinedOfferingEntity implements Entity {

    private ComposedKey key;
    private String descriptionArticle1;
    private String descriptionArticle2;

    @Override
    public ComposedKey getKey() {
        return key;
    }
}
