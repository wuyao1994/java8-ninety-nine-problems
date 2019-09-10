package com.elvis.Lock;

/**
 *
 */
public class TestIntegerMain {
    public static void main(String[] args) {
        Thread a = new Thread(new TestInteger());
        Thread b = new Thread(new TestInteger());
        a.start();
        b.start();
    }
}
