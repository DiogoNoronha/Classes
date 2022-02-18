package academy.mindswap;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class QuoteGenerator {

    public String getQuote() {

        FileInputStream fileToRead = null;

        List<String> listOfQuotes = new ArrayList<>();

        try {
            listOfQuotes =  Files.readAllLines(Path.of("resources/Quotes.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfQuotes.get(Random.generateRandom(0,(listOfQuotes.size()-1)));
    }
}
