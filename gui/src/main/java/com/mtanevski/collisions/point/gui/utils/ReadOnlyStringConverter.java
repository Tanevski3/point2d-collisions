package com.mtanevski.collisions.point.gui.utils;

import javafx.util.StringConverter;

public abstract class ReadOnlyStringConverter<T> extends StringConverter<T> {
    @Override
    public T fromString(String s) {
        throw new IllegalArgumentException();
    }
}
