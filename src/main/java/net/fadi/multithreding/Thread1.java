package net.fadi.multithreding;

/**
 * This class demonstrates a simple implementation of a thread by extending the
 * Thread class.
 * The run() method contains the business logic that will be executed when the
 * thread is started.
 */
public class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Business logic of thread 1");
    }

}
