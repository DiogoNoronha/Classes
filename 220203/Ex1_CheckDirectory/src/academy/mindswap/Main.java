package academy.mindswap;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	DirectoryAnalyser teste = new DirectoryAnalyser();
    teste.createStream();
    teste.checkFilePresence();

    }
}
