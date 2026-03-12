package net.fadi.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Java provides two main types of streams for handling input and output
 * operations:
 * byte streams and character streams.
 * Byte streams (InputStream and OutputStream) are used for handling raw binary
 * data,
 * while character streams (Reader and Writer) are used for handling character
 * data,
 * which is typically text.
 */
public class Main {
    public static void main(String[] args) {
        // read a single byte of data (from standard input (ex: keyboard))
        try {
            System.out.println("Please enter a byte of data (press Enter after typing):"
                    + "Note: Only the first byte will be read, and the rest will be ignored.");
            int byteData = System.in.read();
            System.out.println("Byte data read: " + byteData);
            System.out.println("Character read: " + (char) byteData);
            // Clear the input buffer
            System.in.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // read multiple bytes of data (from standard input (ex: keyboard))
        Scanner scanner = null;
        try {
            System.out.println("Please enter multiple bytes of data (press Enter after typing):");
            scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println("Data read: " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

        // Using FileInputStream and FileOutputStream to read and write data from file
        // to another file (Byte streams)
        // Note: this is better when we want to read/write binary data (ex: images,
        // videos, etc.)
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("src/main/resources/imageSource.png");
            fos = new FileOutputStream("src/main/resources/imageDestination.png");
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        /**
         * FileReader and FileWriter are used for handling character data, which is
         * typically text.
         */
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("src/main/resources/textSource.txt");
            fw = new FileWriter("src/main/resources/textDestination.txt");
            int charData;
            while ((charData = fr.read()) != -1) {
                fw.write(charData);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
