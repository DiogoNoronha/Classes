package academy.mindswap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {

    public static void copy(String input, String output) {

        FileInputStream fileToRead = null;
        FileOutputStream fileToWrite = null;

        byte[] buffer = new byte[1024];

        try {
            fileToRead = new FileInputStream(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            fileToWrite = new FileOutputStream(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            while (fileToRead.read(buffer) != -1) {
                for (byte b : buffer) {
                    if (b != 0) {
                        System.out.print((char) b);
                        fileToWrite.write(b);
                    }
                }
                buffer = new byte[1024];
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileToRead.close();
                fileToWrite.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

