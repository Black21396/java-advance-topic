package net.fadi.synchronization;

public class MathUtil {
    synchronized public void getMultiply(int value) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value: " + value + " * " + i + " = " + (value * i));
        }
    }
}
