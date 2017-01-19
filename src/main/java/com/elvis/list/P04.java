package com.elvis.list;

import java.util.List;

public class P04 {
    public static <T> int length(List<T> numbers) {
        return numbers.size();
    }

    public static <T> long lengthStream(List<T> numbers) {
        return numbers.stream().count();
    }

    public static <T> int lengthRecursive(List<T> list) {
        return _lengthRecursive(list, 0);
    }

    public static <T> int _lengthRecursive(List<T> list, int i) {
        if (list.isEmpty()) {
            return i;
        }
        return _lengthRecursive(list.subList(1, list.size()), ++i);

    }
}
