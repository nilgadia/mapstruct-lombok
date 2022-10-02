The default implementation of the BuilderProvider assumes the following:
• The type has a parameterless public static builder creation method that returns a builder. So for
example Person has a public static method that returns PersonBuilder.
• The builder type has a parameterless public method (build method) that returns the type being
built. In our example PersonBuilder has a method returning Person.
• In case there are multiple build methods, MapStruct will look for a method called build, if such
method exists then this would be used, otherwise a compilation error would be created.
• A specific build method can be defined by using @Builder within: @BeanMapping, @Mapper or
@MapperConfig
• In case there are multiple builder creation methods that satisfy the above conditions then a
MoreThanOneBuilderCreationMethodException will be thrown from the DefaultBuilderProvider SPI.
In case of a MoreThanOneBuilderCreationMethodException MapStruct will write a warning in the
compilation and not use any builder.