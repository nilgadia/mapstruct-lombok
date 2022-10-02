package org.shahid.annotations.velocity;

import java.lang.annotation.*;

/**
 * The BeanInfo annotation type, used to capture descriptive information of the bean
 * to be latter used to generate BeanInfo types suitable for visual editors.
 *
 * @author Shaikh Shahid Iqbal
 * @version
 */
@Documented
@Target({
        ElementType.TYPE,
        ElementType.METHOD,
        ElementType.CONSTRUCTOR,
        ElementType.FIELD,
        ElementType.PARAMETER})
@Retention(RetentionPolicy.SOURCE)
public @interface BeanInfo {

    /**
     * The element description.
     */
    String description() default "";

    /**
     * Whether the element is an expert feature.
     */
    boolean expert() default false;

    /**
     * Whether the element should be hidden in menus of visual editors.
     */
    boolean hidden() default false;

    /**
     * Whether the element should be prioritized in menus of visual editors.
     */
    boolean preferred() default false;
}
