package com.elvis.corecode.Chapter12.pair1;

import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class PairTest1 {

    public static void main(String[] args) {
        // String[] words = { "mary", "had", "a", "little", "lanb" };
        // Pair<String> mm = ArrayAlg.minmax(words);
        // System.out.println("min=" + mm.getFirst());
        // System.out.println("max=" + mm.getSecond());
        GregorianCalendar[] birthdays = {
                new GregorianCalendar(1906, Calendar.DECEMBER, 9),
                new GregorianCalendar(1815, Calendar.DECEMBER, 10),
                new GregorianCalendar(1906, Calendar.DECEMBER, 3),
                new GregorianCalendar(1910, Calendar.DECEMBER, 22)
                
        };
        Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min="+mm.getFirst().getTime());
        System.out.println("max="+mm.getSecond().getTime());
    }

}

class ArrayAlg {
    // public static Pair<String> minmax(String[] a) {
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }

        return new Pair<>(min, max);
    }
}
