package net.fadi.multithreding;

/**
 * This class demonstrates a simple implementation of a thread by implementing
 * the
 * Runnable interface.
 * The run() method contains the business logic that will be executed when the
 * thread is started.
 */
public class Thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Business logic of thread 2");
    }

}
