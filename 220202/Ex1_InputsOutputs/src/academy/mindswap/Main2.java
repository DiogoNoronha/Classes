package academy.mindswap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {

        FileInputStream fileToRead = null;

        try {
            fileToRead = new FileInputStream("./file.txt");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        byte[] buffer = new byte[1024];

        try {
            while (fileToRead.read(buffer) != -1) {
                for (byte b : buffer) {
                    if (b != 0) {
                        System.out.print((char) b);
                    }
                }
                buffer = new byte[1024];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
