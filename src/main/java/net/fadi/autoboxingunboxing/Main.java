package net.fadi.autoboxingunboxing;

public class Main {
    public static void main(String[] args) {
        // Autoboxing: converting a primitive int to an Integer object
        int primitiveInt = 10;
        Integer boxedInt = primitiveInt; // Autoboxing happens here
        System.out.println("Boxed Integer: " + boxedInt);

        // Unboxing: converting an Integer object back to a primitive int
        Integer anotherBoxedInt = 20;
        int unboxedInt = anotherBoxedInt; // Unboxing happens here
        System.out.println("Unboxed int: " + unboxedInt);
    }
}
