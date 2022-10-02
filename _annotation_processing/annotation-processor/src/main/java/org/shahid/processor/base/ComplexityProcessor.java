package org.shahid.processor.base;

import org.shahid.annotations.base.Complexity;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;


/**
 * Annotation processor for Complexity annotation type.
 *
 * @author Shaikh Shahid Iqbal
 * @version
 */
@SupportedAnnotationTypes("org.shahid.annotations.base.Complexity")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class ComplexityProcessor extends AbstractProcessor {

    /**
     * Default constructor.
     */
    public ComplexityProcessor() {

        super();
    }

    /**
     * Reads the complexity value contained in the annotation and prints it in the console
     * (NOTE level).
     *
     * @param annotations set of annotations found
     * @param roundEnv    the environment for this processor round
     * @return whether a new processor round would be needed
     */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element elem : roundEnv.getElementsAnnotatedWith(Complexity.class)) {
            Complexity complexity = elem.getAnnotation(Complexity.class);
            String message = "annotation found in " + elem.getSimpleName();
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, message, elem);

        }
        return true;
    }
}
