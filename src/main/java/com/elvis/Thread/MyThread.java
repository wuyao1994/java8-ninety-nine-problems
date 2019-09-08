package com.elvis.Thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread extends Thread
{
    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> Run object, then that
     * <code>Runnable</code> object's <code>Run</code> method is called;
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
        super.run();
        try {
            Thread.sleep(2000);
            System.out.println("1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(Integer.MAX_VALUE);
        for (int i = 0; i < 10; i++) {
            fixedThreadPool.execute(new MyThread());
        }
        System.out.println(Integer.MAX_VALUE);
    }
}
