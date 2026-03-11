package net.fadi.synchronization;

/**
 * This code demonstrates the use of synchronization in Java to ensure that
 * multiple threads
 * can safely access a shared resource (in this case, the MathUtil class)
 * without causing data
 * we can use the synchronized keyword to ensure that only one thread can access
 * the getMultiply method
 */
public class Main {
    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();

        Thread1 thread1 = new Thread1(mathUtil);
        Thread2 thread2 = new Thread2(mathUtil);

        thread1.start();
        thread2.start();
    }
}
