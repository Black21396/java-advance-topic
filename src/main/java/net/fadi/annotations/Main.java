package net.fadi.annotations;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        DummyClass dummy = new DummyClass();

        // Check if the dummyAttribute is annotated with MarkerAnnotation
        Field dummyAttributeField;
        try {
            dummyAttributeField = dummy.getClass().getField("dummyAttribute");
            if (dummyAttributeField.isAnnotationPresent(MarkerAnnotation.class))
                System.out.println("dummyAttribute is annotated with MarkerAnnotation");
            else
                System.out.println("dummyAttribute is NOT annotated with MarkerAnnotation");
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Check if the dummyMethod is annotated with CustomAnnotation
        try {
            CustomAnnotation customAnnotation = dummy.getClass().getMethod("dummyMethod")
                    .getAnnotation(CustomAnnotation.class);
            if (customAnnotation != null)
                System.out.println(
                        "dummyMethod is annotated with CustomAnnotation with value: " + customAnnotation.value());
            else
                System.out.println("dummyMethod is NOT annotated with CustomAnnotation");

        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
