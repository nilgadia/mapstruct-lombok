## Why Code Generation?

* #### To not repeat the same task again and again (DRY)
* #### To reduce the burden of boilerplate code
* #### To standardize code pattern, follows common idioms
* #### To ensure that best practices are applied
* #### To improve the adherence to the coding style (naming, style)

### So Thanks we have annotation and annotation processor

#### Bean mapping code generator tools

* ###### Mapstruct
* ###### Dozer
* ###### ModelMapper
* ###### Orika
* ###### Selma
* ###### JMapper Framework

[https://www.baeldung.com/java-performance-mapping-frameworks]()

#### Boilerplate code generator tools

* ###### lombok

##### We will discuss on the Mapstruct

`Useful link`

[https://mapstruct.org/documentation/stable/reference/html/]()<br>
[https://github.com/mapstruct/mapstruct/discussions]()<br>
[https://github.com/mapstruct/mapstruct]()<br>
[https://github.com/mapstruct/mapstruct-examples]()<br>

#### Compared to dynamic mapping frameworks, MapStruct offers the following advantages:

* #### Fast execution by using plain method invocations instead of reflection
* #### Compile-time type safety: Only objects and attributes mapping to each other can be mapped, no accidental mapping of an order entity into a customer DTO etc.
* #### Clear error-reports at build time, if
    * ##### mappings are incomplete (not all target properties are mapped)
    * ##### mappings are incorrect (cannot find a proper mapping method or type conversion)

