package org.shahid.annotations.base;

import java.lang.annotation.*;

/**
 * Annotation type modeling authorship information for types.
 *
 * @author Shaikh Shahid Iqbal
 */
@Documented
@Target({
        ElementType.TYPE,
        ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
public @interface Author {

    /**
     * Author's name.
     */
    String name();

    /**
     * Date of creation.
     */
    String created();

    /**
     * Revision number.
     */
    int revision() default 1;

    /**
     * Array of reviewer names.
     */
    String[] reviewers() default {};
}
