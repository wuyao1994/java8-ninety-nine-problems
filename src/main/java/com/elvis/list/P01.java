package com.elvis.list;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class P01 {
    public static <T> T last(LinkedList<T> elements) {
        if (elements == null | elements.isEmpty()) {
            throw new NoSuchElementException();
        }
        return elements.getLast();
    }
    
    public static <T> T last1(List<T> elements) {
        return elements.get(elements.size()-1);
    }
    
    public static <T> T lastRecursive(List<T> elements) {
        if (elements == null || elements.isEmpty()) {
            throw new NoSuchElementException();
        }
        if (elements.size() == 1) {
            return elements.get(0);
        }
        
        return lastRecursive(elements.subList(1, elements.size()));
    }
}
