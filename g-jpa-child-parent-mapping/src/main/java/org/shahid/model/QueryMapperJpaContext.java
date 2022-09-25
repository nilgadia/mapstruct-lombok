package org.shahid.model;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;

import javax.persistence.EntityManager;

public class QueryMapperJpaContext {

    @SuppressWarnings("unused")
    private final EntityManager em;
    private Query query;

    public QueryMapperJpaContext(EntityManager em) {
        this.em = em;
    }

    @BeforeMapping
    public void setQuery(@MappingTarget Query query) {
        this.query = query;
    }

    @AfterMapping
    public void setQueryToInput(@MappingTarget Input input) {
        input.setQuery(query);
    }

    @AfterMapping
    public void setQueryToOutput(@MappingTarget Output output) {
        output.setQuery(query);
    }
}
