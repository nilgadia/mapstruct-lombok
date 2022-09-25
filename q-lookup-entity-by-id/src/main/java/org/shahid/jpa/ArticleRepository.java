package org.shahid.jpa;

public class ArticleRepository {

    public CombinedOfferingEntity lookup(ComposedKey key) {
        // do some DB lookups here.
        CombinedOfferingEntity entity = new CombinedOfferingEntity();
        entity.setKey( key );
        return entity;
    }

}
