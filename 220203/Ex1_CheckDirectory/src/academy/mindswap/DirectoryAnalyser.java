package academy.mindswap;

import java.io.*;

public class DirectoryAnalyser {

    private BufferedReader consoleReader;
    private BufferedWriter writer;


    public void createStream() throws IOException {
        consoleReader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new FileWriter("LogOfFiles.txt"));
    }

    public void writeDownFiles() throws IOException {
        File dir = askForDirectory();
        String[] files = dir.list();
        for (String name: files) {
            writer.write(name);
            writer.newLine();
            writer.flush();
        }
    }

    public void checkFilePresence() throws IOException {
        File dir = askForDirectory();
        String[] files = dir.list();
        String fileName = getUserInput("File to check:");
        for (String name: files) {
            if (name.equals(fileName)){
                System.out.println("The file exist!");
                return;
            }
            System.out.println("The file you are looking for is not in this directory.");
        }
    }

    public void createFile(){}

    private File askForDirectory() throws IOException {
        String directory = getUserInput("Input the directory path:");
        File placeHolder = new File(directory);
        if(!placeHolder.isDirectory()){
            return askForDirectory();
        }
        return placeHolder;
    }

    private String getUserInput(String message) throws IOException {
        System.out.println(message);
        return consoleReader.readLine();
    }

    //private boolean checkIfNotDirectory(File file){}

    //public void closeStreams(){}

    //private boolean checkNullableStrings(){return writer == null || return consoleReader == null;}
}
