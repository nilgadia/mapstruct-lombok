package org.shahid.annotations.base;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Annotation type modeling a Work Product identification.
 *
 * @author Shaikh Shahid Iqbal
 * @version
 */
@Documented
@Target(ElementType.TYPE)
public @interface WorkProduct {

    /**
     * The Work Product identification.
     */
    String value();
}
