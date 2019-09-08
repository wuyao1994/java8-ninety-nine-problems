package com.elvis.Lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author elvis
 */
public class MyserviceMoreCondition {
    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();

    public void awaitA() {
        lock.lock();
        try {
            System.out.println("await A start:" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("await A end:" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        lock.lock();
        try {
            System.out.println("await B start:" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("await B end:" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A() {
        lock.lock();
        try {
            System.out.println("signal" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_B() {
        lock.lock();
        try {
            System.out.println("signal" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
            conditionB.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
