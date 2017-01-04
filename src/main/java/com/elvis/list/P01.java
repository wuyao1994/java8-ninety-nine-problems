package com.elvis.list;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class P01 {
    public static <T> T last(LinkedList<T> elements) {
        if (elements == null | elements.isEmpty()) {
            throw new NoSuchElementException();
        }
        return elements.getLast();
    }
}
