package net.zffu.compackt.fields;

/**
 * The field types supported in a {@link net.zffu.compackt.model.CompacktModel}
 * @author Zffu
 * @since 1.0.0
 */
public enum CompacktFieldType {

    STRING,
    INT,
    FLOAT;

    /**
     * Gets the type's optional variant of its id.
     * @return the optional id.
     */
    public int getOptionalVariant() {
        return ordinal() + 3;
    }

}
