package org.shahid.mapper.util;

import org.mapstruct.BeforeMapping;
import org.mapstruct.TargetType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TaxContext {

    private final Map<String, List<Annotation>> annotations = new HashMap<>();

    @BeforeMapping
    public void registerAnnotationsForTarget(@TargetType Class<?> t) {
        /* Although MapStruct is all about generating code, there is currently
         * no means to analyse annotations runtime without reflection. One could
         * even argue whether this is should be part of a mapping framework such
         * as MapStruct. Hence, reflection is used in this particular place, in this
         * example to demonstrate how to do this.
         */
        Method[] methods = t.getMethods();
        for (Method method : methods) {
            for (Annotation annotation : method.getAnnotations()) {
                registerAnnotationForMethod(method.getName(), annotation);
            }
        }
    }

    private void registerAnnotationForMethod(String methodName, Annotation annotation) {
        if (!annotations.containsKey(methodName)) {
            annotations.put(methodName, new ArrayList<>());
        }
        annotations.get(methodName).add(annotation);
    }

    public List<Annotation> getAnnotationsForMethod(String methodName) {
        return annotations.getOrDefault(methodName, new ArrayList<>());
    }
}
