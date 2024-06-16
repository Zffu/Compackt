package net.zffu.compackt;


/**
 * Model for a Compackt conversion.
 * @author Zffu
 * @since 1.0.0
 */
public class CompacktModel {

    /**
     * The fields that are possibly in the conversion.
     */
    private Object[] fields;

    /**
     * Constructs a model with the excepted field size.
     * @param exceptedFields
     */
    public CompacktModel(int exceptedFields) {
        this.fields = new Object[exceptedFields];
    }
}
