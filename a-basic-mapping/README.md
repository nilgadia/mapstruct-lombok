## <span style="color:green">Basic Mapping</span>

* #### When a property has the same name as its target entity counterpart, it will be mapped implicitly.
* #### When a property has a different name in the target entity, its name can be specified via the @Mapping annotation.

<span style="color:yellow">
@BeanMapping(ignoreByDefault = true) the default behavior will be
explicit mapping, meaning that all mappings have to be specified by means of the
@Mapping and no warnings will be issued on missing target properties.
</span></br>

###### @ToEntity

<span style="color:lightskyblue">
if it quacks like duck, walks like a duck it's probably a duck. This
concept is also known as "duck-typing"
</span><br>

###### @InheritConfiguration