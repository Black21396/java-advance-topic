package net.fadi.annotations;

public class DummyClass {
    @MarkerAnnotation
    public int dummyAttribute;

    @CustomAnnotation(value = 10)
    public void dummyMethod() {
        // Any method implementation
    }
}
