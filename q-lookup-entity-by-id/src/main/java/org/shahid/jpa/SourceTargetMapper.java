package org.shahid.jpa;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SourceTargetMapper {

    SourceTargetMapper MAPPER = Mappers.getMapper(SourceTargetMapper.class);

    @Mapping(target = "key", ignore = true)
    @Mapping(target = "descriptionArticle1", source = "brush.description")
    @Mapping(target = "descriptionArticle2", source = "paste.description")
    CombinedOfferingEntity toEntity(Toothbrush brush, ToothPaste paste, @Context ArticleRepository repo);

    @ObjectFactory
    default <T extends Entity> T lookup(Toothbrush brush, ToothPaste paste, @Context ArticleRepository repo,
                                        @TargetType Class<T> targetType) {
        ComposedKey key = new ComposedKey(brush.getName(), paste.getName());
        CombinedOfferingEntity entity = repo.lookup(key);
        if (entity == null) {
            entity = new CombinedOfferingEntity();
        }
        return (T) entity;
    }

}
