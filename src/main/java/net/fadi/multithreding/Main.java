package net.fadi.multithreding;

public class Main {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread2 thread2 = new Thread2();
        Thread t2 = new Thread(thread2);
        t2.start();
    }
}
