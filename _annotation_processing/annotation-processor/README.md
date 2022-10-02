### Annotation Processors

* #### Annotations are first-class citizens in the java language
* #### Formalized in the java language specification
* #### Readable at run time:
    * ##### class.getAnnotations()
    * ##### class.getAnnotationsByType(Class</A>)
    * ##### class.getDeclaredAnnotations()
    * ##### class.getDeclaredAnnotationsByType(Class</A>)
* #### Can trigger custom actions at compile time managed by Annotation Processors!
* #### When first introduced in java 5, the Annotation Processing API was not standard
    * ##### A standalone tool, apt, was needed to process the annotations
    * ##### Mirror API distributed in com.sun.mirror packages
* #### Staring with Java 6, standardized through JSR-269
    * ##### apt, although still available for standalone execution, was seamlessly integrated into the java compiler, javac
    * ##### Annotation Processing API distributed in javax.lang.model packages
* #### Since java 8, apt is no longer available in the JDK

### Annotation Processors API

* #### Annotation Processor:
    * ##### Implements javax.annotation.processing.Processor
    * ##### Implements javax.annotation.processing.AbstractProcessor
* #### May use three annotations to configure itself:
    * ##### jx.a.p.SupportedAnnotationTypes - Used to flag which Annotation Types are managed by the processor
    * ##### jx.a.p.SupportedSourceVersion - Used to flag the latest java source level supported by the processor
    * ##### jx.a.p.SupportedOptions - Used to register custom parameters that may be passed through the command line.
* #### TL;DR - Implement the process() method

### Rounds and Environment

* #### Annotation processing happens in rounds
* #### In each round, a subset of source are compiled, and the processors matching the annotations found on those sources are called
* #### Processing ends with no more sources/annotations are pending
* #### Processing may claim all annotation type with a wildcard
* #### process() method as two parameters:
    * ##### Set<? extends javax.lang.model.element.TypeElement - subset of annotations being processed
    * ##### javax.annotation.processing.RoundEnvironment - access to information about the current and previous round
    * ##### When extending jx.a.p.AbstractProcessor, there is available an instance variable of type jx.a.p.ProcessingEnvironment with access to specialized logging tool, the Messager

### Creating Files

* #### jx.a.p.ProcessingEnvironment also provide access to the filer utility that allows for easy file creation
    * ##### Files are placed in the right folder as required by the compiler settings
    * ##### Folders hierarchy mapping the package name
  JavaFileObject jfo = processingEnv.getFiler().createSourceFile(newClassQualifiedName);
  Writer writer = jfo.openWriter();
  or
  JavaFileObject jfo = processingEnv.getFiler().createClassFile(newClassQualifiedName);
  OutputStream os = jfo.openOutputStream();

#### How the Compiler Knows?

* #### Annotation Processor should be registered.
* #### The easiest way - leverage the standard services mechanism
    * ##### Package the processor in a jar file
    * ##### Include file META-INF/services/javax.annotation.processing.Processor
    * ##### Contents are fully qualified names of all processor, one per line

### Running Annotation Processor

* #### Multiple way
    * ##### javac
    * ##### Apache Maven builds
    * ##### Continuous Integration builds
    * ##### IDE

* #### Running APs with javac
    * ##### Use -proc:none when compiling Annotation Processor
    * ##### When compiling the annotated classes:
        * ###### Annotation types in classpath ->$CP
        * ###### Annotation processor and dependencies in AP classpath -> $APCP
        * ###### Generated source can be placed in different folder
      javac -classpath $CP -processorpath $APCP source -s generatedSourceDir
        * ###### Use -XprintProcessorInfo -XprintRounds and javac will print to console information about the processing (e.g. rounds)
* #### Running APs with Apache Maven
    * ##### Annotation Type artifacts
        * ###### Don't have any special requirement
    * ##### Annotation Processor artifacts
        * ###### May add -proc:none to compiler arguments to disable Annotation processing during compilation
    * ##### Artifacts using the annotations
        * ###### Add AP artifacts as a dependency with compile scope
        * ###### Add optionally compiler arguments for -Xprint... parameters
* #### Running APs with Eclipse/IntelliJ IDE
    * ##### Java Compiler -> Annotation Processing

### Bytecode Manipulation

* ##### When the target to modify existing classes (enhancing), a different approach is needed:
    * ###### Work directly with javac API - For example Project Lombok
    * ###### Bytecode manipulation with third party libraries as ASM, cglib or javassist - Example Datanucleus
* ##### Pros: exquisite leve of control over the bytecodes
* ##### Cons: mastering bytecodes and the compiler API is not easy task
* ##### Example lombok.javac.handlers.HandleGetter 