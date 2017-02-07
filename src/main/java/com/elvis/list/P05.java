package com.elvis.list;

import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;
import java.util.*;

public class P05 {
    public static <T> List<T> ReverseAList(List<T> list) {
        if (list == null) {
            throw new NoSuchElementException();
        }
        Collections.reverse(list);
        return list;
    }
    
    public static <T> List<T> reverse_foreach(List<T> list) {
        if (list == null) {
            throw new NoSuchElementException();
        }
        LinkedList<T> reverse = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }
        
        return reverse;
    }
    
    public static <T> List<T> reverse_IntStream(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("list can't be null");
        }
        int size = list.size();
        return IntStream.iterate(size - 1, e -> e -1).limit(size).mapToObj(list::get).collect(toList());
    }
    
    public static <T> List<T> reverse_StreamSupport(ArrayDeque<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("list can't not be null");
        }
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(list.descendingIterator(), Spliterator.ORDERED), false).collect(toList());
    }
}
