package com.elvis.list;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class P03 {
    public static <T> T kth(final List<T> numbers, final int k) {
        return numbers.get(k);
    }
    
    public static <T> T kthRecursive(final LinkedList<T> elements, final int k) {
        if (k == 0) {
            return elements.getFirst();
        }
        return kthRecursive(new LinkedList<>(elements.subList(1, elements.size())), k - 1);
    }
    
    public static <T> T kthStream(final List<T> list, final int k) {
        return list.stream().limit(k+1).collect(Collectors.toCollection(LinkedList::new)).getLast();
    }
}
