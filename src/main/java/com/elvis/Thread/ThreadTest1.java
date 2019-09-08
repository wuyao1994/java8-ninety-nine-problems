package com.elvis.Thread;

public class ThreadTest1 extends Thread{
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
        super.run();
        System.out.println("thread run");
    }

    public static void main(String[] args) {
        Thread thread = new ThreadTest1();
        thread.start();
        System.out.println("process run");
    }
}
