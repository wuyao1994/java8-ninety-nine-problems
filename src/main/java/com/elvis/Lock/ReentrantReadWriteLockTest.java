package com.elvis.Lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author elvis
 */
public class ReentrantReadWriteLockTest {
    public static void main(String[] args) throws InterruptedException{
        Service service = new Service();
        for (int i = 0; i < 100; i++) {
            ThreadA threadA = new ThreadA(service);
            threadA.setName("A");
            threadA.start();
        }
        Thread.sleep(1000);
        for (int i = 0; i < 100; i++) {
            ThreadB threadB = new ThreadB(service);
            threadB.setName("B");
            threadB.start();
        }

    }
    static public class Service {
        private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

        public void read() {
            try {
                try {
                    lock.readLock().lock();
                    System.out.println("get read lock" + Thread.currentThread().getName()+ System.currentTimeMillis());
                    Thread.sleep(1000);
                } finally {
                    lock.readLock().unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void write() {
            try {
                try {
                    lock.writeLock().lock();
                    System.out.println("get waite lock" + Thread.currentThread().getName()+ System.currentTimeMillis());
                    Thread.sleep(1000);
                } finally {
                    lock.writeLock().unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static public class ThreadA extends Thread{
        private Service service;

        /**
         * Allocates a new {@code Thread} object. This constructor has the same
         * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
         * {@code (null, null, gname)}, where {@code gname} is a newly generated
         * name. Automatically generated names are of the form
         * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
         */
        public ThreadA(Service service) {
            super();
            this.service = service;
        }

        /**
         * If this thread was constructed using a separate
         * <code>Runnable</code> run object, then that
         * <code>Runnable</code> object's <code>run</code> method is called;
         * otherwise, this method does nothing and returns.
         * <p>
         * Subclasses of <code>Thread</code> should override this method.
         *
         * @see #start()
         * @see #stop()
         * @see #Thread(ThreadGroup, Runnable, String)
         */
        @Override
        public void run() {
            service.read();
        }
    }

    static public class ThreadB extends Thread{
        private Service service;

        /**
         * Allocates a new {@code Thread} object. This constructor has the same
         * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
         * {@code (null, null, gname)}, where {@code gname} is a newly generated
         * name. Automatically generated names are of the form
         * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
         */
        public ThreadB(Service service) {
            super();
            this.service = service;
        }

        /**
         * If this thread was constructed using a separate
         * <code>Runnable</code> run object, then that
         * <code>Runnable</code> object's <code>run</code> method is called;
         * otherwise, this method does nothing and returns.
         * <p>
         * Subclasses of <code>Thread</code> should override this method.
         *
         * @see #start()
         * @see #stop()
         * @see #Thread(ThreadGroup, Runnable, String)
         */
        @Override
        public void run() {
            service.write();
        }
    }
}
