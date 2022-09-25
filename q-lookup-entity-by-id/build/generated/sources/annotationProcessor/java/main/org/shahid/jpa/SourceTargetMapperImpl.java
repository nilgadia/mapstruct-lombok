package org.shahid.jpa;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-25T13:52:05+0300",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
public class SourceTargetMapperImpl implements SourceTargetMapper {

    @Override
    public CombinedOfferingEntity toEntity(Toothbrush brush, ToothPaste paste, ArticleRepository repo) {
        if ( brush == null && paste == null ) {
            return null;
        }

        CombinedOfferingEntity combinedOfferingEntity = lookup( brush, paste, repo, CombinedOfferingEntity.class );

        if ( brush != null ) {
            combinedOfferingEntity.setDescriptionArticle1( brush.getDescription() );
        }
        if ( paste != null ) {
            combinedOfferingEntity.setDescriptionArticle2( paste.getDescription() );
        }

        return combinedOfferingEntity;
    }
}
