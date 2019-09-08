package com.elvis.Lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author elvis
 */
public class UseSingleConditionWaitNotify {
    public static void main(String[] args) throws InterruptedException{
        MyService myService = new MyService();
        ThreadA service = new ThreadA(myService);
        service.start();
        Thread.sleep(3000);
        myService.signal();
    }

    static public class MyService {
        private Lock lock = new ReentrantLock();
        public Condition condition = lock.newCondition();

        public void await() {
            lock.lock();
            try {
                System.out.println("await:" + System.currentTimeMillis());
                condition.await();
                System.out.println("await end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void signal() {
            lock.lock();
            try {
                System.out.println("signal:" + System.currentTimeMillis());
                condition.signal();
                Thread.sleep(3000);
                System.out.println("signal end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

    }

    static public class ThreadA extends Thread {
        private MyService service;

        /**
         * Allocates a new {@code Thread} object. This constructor has the same
         * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
         * {@code (null, null, gname)}, where {@code gname} is a newly generated
         * name. Automatically generated names are of the form
         * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
         */
        public ThreadA(MyService service) {
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
            service.await();
        }
    }
}
