package net.fadi.serialization;

import java.io.Serializable;

import lombok.Data;

@Data
public class Student implements Serializable {
    transient int id; // This field will not be serialized
    private String name;
    private int age;
}
