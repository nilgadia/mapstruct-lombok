package org.shahid.annotations.base;

import java.lang.annotation.*;

/**
 * Annotation type modeling the complexity level of types and methods.
 *
 * @author Shaikh Shahid Iqbal
 * @version
 */
@Documented
@Target({
        ElementType.TYPE,
        ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Complexity {

    /**
     * The complexity level.
     */
    ComplexityLevel value() default ComplexityLevel.MEDIUM;
}
