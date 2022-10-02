package org.shahid.annotation.base;


import org.shahid.annotations.base.Author;
import org.shahid.annotations.base.Complexity;
import org.shahid.annotations.base.ComplexityLevel;
import org.shahid.annotations.base.WorkProduct;

/**
 * A simple class using Author, Complexity and WorkProduct annotations.
 *
 * @author Shaikh Shahid Iqbal
 * @version
 */
@Author(name = "Shahid",
        created = "17/09/2022",
        revision = 3,
        reviewers = {"George", "Fred"}) // multiple attributes are separated by commas
@WorkProduct("WP00000182") // if only one annotation attribute is defined
// and its name is 'value', it can be omitted
@Complexity(ComplexityLevel.VERY_SIMPLE)
public class SimpleAnnotationsTest {

    /**
     * Default constructor.
     */
    @Author(name = "Shahid",
            created = "17/09/2022") // this annotation types applies also to constructors
    // default values assumed for revision and reviewers
    public SimpleAnnotationsTest() {

        super();
    }

    /**
     * Some method.
     */
    @Complexity() // this annotation type applies also to methods
    // the default value 'ComplexityLevel.MEDIUM' is assumed
    public void theMethod() {

        System.out.println("console output");
    }
}
