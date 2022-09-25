package org.shahid.mapper.annotations;

import org.mapstruct.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This is a qualfier with the opposite purpose. It is never used in an @Mapping and
 * its purpose is to avoid selection of a method annotated with his qualifier
 */
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface DoNotSelectForMapping {
}
