package ru.chukhontsev.generic;

public class Storage <T> {
    private final T object;
    private final T alterValue;

    public Storage (T object, T alterValue){
        this.object = object;
        this.alterValue = alterValue;

    }

    public T getObject() {
        return object != null ? object : alterValue;
    }

}
