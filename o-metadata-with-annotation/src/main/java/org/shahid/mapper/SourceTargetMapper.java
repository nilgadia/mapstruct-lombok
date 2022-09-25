package org.shahid.mapper;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.LegalEntity;
import org.shahid.dto.TaxRecord;
import org.shahid.entities.LegalEntityPE;
import org.shahid.entities.OrganisationPE;
import org.shahid.entities.PersonPE;
import org.shahid.entities.TaxRecordPE;
import org.shahid.mapper.annotations.DoNotSelectForMapping;
import org.shahid.mapper.annotations.Treatment;
import org.shahid.mapper.util.TaxContext;

import java.lang.annotation.Annotation;
import java.util.List;


@Mapper
public abstract class SourceTargetMapper {

    public static final SourceTargetMapper MAPPER = Mappers.getMapper(SourceTargetMapper.class);

    public abstract TaxRecordPE toTarget(TaxRecord s, @Context TaxContext ctx);

    protected LegalEntityPE convert(LegalEntity s, @Context TaxContext ctx) {

        List<Annotation> annotations = ctx.getAnnotationsForMethod("setLegalEntity");
        String formatAs = annotations.stream()
                .filter(Treatment.class::isInstance)
                .map(Treatment.class::cast)
                .findFirst()
                .map(Treatment::formatAs)
                .orElse("person");
        if ("organisation".equals(formatAs)) {
            return mapOrganisation(s);
        } else {
            return mapPerson(s);
        }
    }

    @DoNotSelectForMapping
    @Mapping(target = "socialSecurityNumber", source = "id")
    protected abstract PersonPE mapPerson(LegalEntity s);

    @DoNotSelectForMapping
    @Mapping(target = "chamberOfCommerceNumber", source = "id")
    protected abstract OrganisationPE mapOrganisation(LegalEntity s);
}
