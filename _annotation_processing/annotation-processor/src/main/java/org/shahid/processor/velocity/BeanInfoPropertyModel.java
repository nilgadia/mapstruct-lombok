package org.shahid.processor.velocity;

/**
 * Model for a property BeanInfo.
 *
 * @author Shaikh Shahid Iqbal
 */
public class BeanInfoPropertyModel {

    /**
     * Property name.
     */
    private String name;

    /**
     * Property qualified type.
     */
    private String qualifiedType;

    /**
     * Property description.
     */
    private String description;

    /**
     * Whether the property is an expert feature.
     */
    private boolean expert;

    /**
     * Whether the property should be hidden in menus of visual editors.
     */
    private boolean hidden;

    /**
     * Whether the property should be prioritized in menus of visual editors.
     */
    private boolean preferred;

    /**
     * Default constructor.
     */
    public BeanInfoPropertyModel() {
        super();
    }

    /**
     * Getter for name property.
     *
     * @return the property value.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name property.
     *
     * @param name the name to set
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for qualifiedType property.
     *
     * @return the property value.
     */
    public String getQualifiedType() {
        return qualifiedType;
    }

    /**
     * Setter for qualifiedType property.
     *
     * @param qualifiedType the qualifiedType to set
     */
    void setQualifiedType(String qualifiedType) {
        this.qualifiedType = qualifiedType;
    }

    /**
     * Getter for description property.
     *
     * @return the property value.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for description property.
     *
     * @param description the description to set
     */
    void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for expert property.
     *
     * @return the property value.
     */
    public boolean isExpert() {
        return expert;
    }

    /**
     * Setter for expert property.
     *
     * @param expert the expert to set
     */
    void setExpert(boolean expert) {
        this.expert = expert;
    }

    /**
     * Getter for hidden property.
     *
     * @return the property value.
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Setter for hidden property.
     *
     * @param hidden the hidden to set
     */
    void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * Getter for preferred property.
     *
     * @return the property value.
     */
    public boolean isPreferred() {
        return preferred;
    }

    /**
     * Setter for preferred property.
     *
     * @param preferred the preferred to set
     */
    void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }
}
