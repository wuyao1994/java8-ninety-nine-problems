package com.elvis.Lock;

/**
 * @author elvis
 */
public class UseMoreConditionWaitNotify {
    public static void main(String[] args) throws InterruptedException{
        MyserviceMoreCondition myserviceMoreCondition = new MyserviceMoreCondition();
        ThreadA threadA = new ThreadA(myserviceMoreCondition);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(myserviceMoreCondition);
        threadB.setName("B");
        threadB.start();
        Thread.sleep(3000);
        myserviceMoreCondition.signalAll_A();
    }
    static public class ThreadA extends Thread {
        private MyserviceMoreCondition myserviceMoreCondition;

        /**
         * Allocates a new {@code Thread} object. This constructor has the same
         * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
         * {@code (null, null, gname)}, where {@code gname} is a newly generated
         * name. Automatically generated names are of the form
         * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
         */
        public ThreadA(MyserviceMoreCondition myserviceMoreCondition) {
            super();
            this.myserviceMoreCondition = myserviceMoreCondition;
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
            myserviceMoreCondition.awaitA();
        }
    }

    static public class ThreadB extends Thread {
        private MyserviceMoreCondition myserviceMoreCondition;

        /**
         * Allocates a new {@code Thread} object. This constructor has the same
         * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
         * {@code (null, null, gname)}, where {@code gname} is a newly generated
         * name. Automatically generated names are of the form
         * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
         */
        public ThreadB(MyserviceMoreCondition myserviceMoreCondition) {
            super();
            this.myserviceMoreCondition = myserviceMoreCondition;
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
            myserviceMoreCondition.awaitB();
        }
    }
}
