package net.zffu.compackt.model;


import net.zffu.compackt.fields.CompacktFieldType;

/**
 * Model for a Compackt conversion.
 * @author Zffu
 * @since 1.0.0
 */
public class CompacktModel {

    /**
     * The fields that are possibly in the conversion.
     */
    private int[] fields;
    private int fieldIndex = 0;

    /**
     * Constructs a model with the excepted field size.
     * @param exceptedFields
     */
    public CompacktModel(int exceptedFields) {
        this.fields = new int[exceptedFields];
    }

    /**
     * Adds the field type as a new field contained in the model.
     * @param type the type
     */
    public void addField(CompacktFieldType type) {
        this.fields[fieldIndex] = type.ordinal();
        this.fieldIndex++;
    }

    /**
     * Adds the field type as a new field contained in the model but as an optional field.
     * @param type the type
     */
    public void addOptionalField(CompacktFieldType type) {
        this.fields[fieldIndex] = type.ordinal() + 3;
        this.fieldIndex++;
    }

}
