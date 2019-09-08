package com.elvis.pipedInputOutput;


import java.io.PipedInputStream;

public class ThreadRead extends Thread{
    private ReadData read;
    private PipedInputStream input;

    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, gname)}, where {@code gname} is a newly generated
     * name. Automatically generated names are of the form
     * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
     */
    public ThreadRead(ReadData read, PipedInputStream input) {
        super();
        this.read = read;
        this.input = input;
    }

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
        read.readMethod(input);
    }
}
