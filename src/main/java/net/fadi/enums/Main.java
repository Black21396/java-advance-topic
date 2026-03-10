package net.fadi.enums;

public class Main {

    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println("Color: " + color.getValue());

        for (Color c : Color.values()) {
            System.out.println("Color: " + c.getValue());
        }
    }
}
