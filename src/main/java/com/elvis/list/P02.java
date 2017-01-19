package com.elvis.list;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class P02 {
    public static <T> T secondList(List<T> elements) {
        if (elements.size() < 2) {
            throw new NoSuchElementException();
        }
        
        return elements.get(elements.size() - 2);
    }
    
    public static <T> T secondListRecursion(LinkedList<T> elements) {
        if (elements.size() < 2) {
            throw new NoSuchElementException();
        }
        if (elements.size() == 2) {
            //return elements.get(0);
            return elements.getFirst();
        }
        return secondListRecursion(new LinkedList<T> (elements.subList(1, elements.size())));
    }
}
