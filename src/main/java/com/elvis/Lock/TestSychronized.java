package com.elvis.Lock;


class MyThread1 extends Thread {

    private TestSychronized test;

    public MyThread1(TestSychronized test) {
        this.test = test;
    }

    @Override
    public void run() {
        test.fun1();
        test.fun3();
    }

}

class MyThread2 extends Thread {

    private TestSychronized test;

    public MyThread2(TestSychronized test) {
        this.test = test;
    }

    @Override
    public void run() {
        test.fun2();
        test.fun4();
    }
}

public class TestSychronized {

    static synchronized void fun1() {
        System.out.println(Thread.currentThread().getName() + "静态方法锁fun1，等待2s");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static synchronized void fun2() {
        System.out.println(Thread.currentThread().getName() + "静态方法锁fun2，等待2s");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void fun3() {
        System.out.println(Thread.currentThread().getName() + "实例方法锁fun3,等待2s");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void fun4() {
        System.out.println(Thread.currentThread().getName() + "实例方法锁fun4,等待2s");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        TestSychronized ts1 = new TestSychronized();
        TestSychronized ts2 = new TestSychronized();
        MyThread1 mt1 = new MyThread1(ts1);
        MyThread1 mt2 = new MyThread1(ts2);
//		MyThread2 mt3 = new MyThread2(ts1);
//		MyThread2 mt4 = new MyThread2(ts2);

        mt1.start();
        mt2.start();
//		mt3.start();
//		mt4.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
