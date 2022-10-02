package org.shahid.processor.velocity;

import java.util.List;

/**
 * Model for a method BeanInfo.
 *
 * @author Shaikh Shahid Iqbal
 * @version
 */
public class BeanInfoMethodModel {

    /**
     * Method name.
     */
    private String name;

    /**
     * Method qualified return type.
     */
    private String qualifiedType;

    /**
     * Method parameters.
     */
    private List<BeanInfoPropertyModel> parameters;

    /**
     * Method description.
     */
    private String description;

    /**
     * Whether the method is an expert feature.
     */
    private boolean expert;

    /**
     * Whether the method should be hidden in menus of visual editors.
     */
    private boolean hidden;

    /**
     * Whether the method should be prioritized in menus of visual editors.
     */
    private boolean preferred;

    /**
     * Default constructor.
     */
    public BeanInfoMethodModel() {
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
     * Getter for parameters property.
     *
     * @return the property value.
     */
    public List<BeanInfoPropertyModel> getParameters() {
        return parameters;
    }

    /**
     * Setter for parameters property.
     *
     * @param parameters the parameters to set
     */
    void setParameters(List<BeanInfoPropertyModel> parameters) {
        this.parameters = parameters;
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
