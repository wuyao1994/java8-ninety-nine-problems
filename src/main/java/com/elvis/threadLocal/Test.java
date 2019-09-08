package com.elvis.threadLocal;

import java.util.Date;

/**
 * Created by elvis on 2018/12/27.
 */
public class Test {
//    public static ThreadLocalExt t1 = new ThreadLocalExt();
//
//    public static void main(String[] args) {
//        if (t1.get() == null) {
//            System.out.println("从未放过值");
//            t1.set("我的值");
//        }
//        System.out.println(t1.get());
//        System.out.println(t1.get());
//    }
//    static public class ThreadLocalExt extends ThreadLocal {
//        @Override
//        protected Object initialValue() {
//            return "我是默认值 第一次get不再为null";
//        }
//    }
public static void main(String[] args) {
    try {
        for (int i = 0; i < 10; i++) {
            Tools.tl.set(System.currentTimeMillis());
            System.out.println("       在Main线程中取值=" + Tools.tl.get());
            Thread.sleep(100);
        }
        Thread.sleep(100);
        ThreadA a = new ThreadA();
        a.start();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    static public class Tools {
        public static InheritableThreadLocalExt tl = new InheritableThreadLocalExt();
    }
    static public class InheritableThreadLocalExt extends InheritableThreadLocal {
        @Override
        protected Object initialValue() {
            return System.currentTimeMillis();
        }

        @Override
        protected Object childValue(Object parentValue) {
            return parentValue + " 我在子线程加的~!";
        }
    }

    static public class ThreadA extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("在ThreadA线程中取值=" + Tools.tl.get());
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
