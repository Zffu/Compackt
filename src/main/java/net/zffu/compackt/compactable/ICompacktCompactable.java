package net.zffu.compackt.compactable;

/**
 * Interface of a class that can be compacted by using Compackt.
 * @param <T>
 * @since 1.0.0
 */
public interface ICompacktCompactable<T> {

    /**
     * Gets the object from the compactable object instance.
     * @param t the instancied object.
     * @return the objects that needs to be compacted.
     */
    Object[] getObjectsFrom(T t);

}
