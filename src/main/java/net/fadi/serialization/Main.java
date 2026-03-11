package net.fadi.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("John Doe");
        student.setAge(20);

        File f = new File("src/main/resources/student.txt");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            System.out.println("Student object has been serialized to " + f.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
                if (fos != null)
                    fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Deserialized Student: " + deserializedStudent);
            System.out.println(
                    "Note: The 'id' field is transient and was not serialized, so it will have the default value of 0.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (fis != null)
                    fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
