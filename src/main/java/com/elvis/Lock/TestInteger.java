package com.elvis.Lock;

public class TestInteger implements Runnable{
    public static Integer a = 0;
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try {

            for(int i = 0; i < 500; i++) {
                synchronized (a) {
                    a++;
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread() + "--------" + a);
                }
            }
        } catch (InterruptedException e ){
            e.printStackTrace();
        }
    }
}
