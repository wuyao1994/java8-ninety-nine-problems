package com.elvis.Lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author elvis
 */
public class FairorNofairLock {
    public static void main(String[] args) {
        final Service service = new Service(false);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread" + Thread.currentThread().getName() + "running");
                service.serviceMethod();
            }
        };

        Thread[] threads = new Thread[10];

        for(int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
    static public class Service {
        private ReentrantLock lock;

        public Service(boolean isFair) {
            lock = new ReentrantLock(isFair);
        }

        public void serviceMethod() {
            lock.lock();
            try {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + "get lock");
            } finally {
                lock.unlock();
            }
        }
    }
}
