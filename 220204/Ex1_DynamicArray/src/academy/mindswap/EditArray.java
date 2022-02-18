package academy.mindswap;

import java.io.*;

public class EditArray {

    public static Object[] addItem(Object[] array, Object object){
        int numberOfObjects = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                numberOfObjects++;
            }
        }

        printArray(array);

        if (array.length > numberOfObjects){
            array[numberOfObjects] = object;
            return array;
        }

        Object[] newArray = array;

        array = new Object[array.length*2];

        for (int i = 0; i < newArray.length; i++) {
            array[i] = newArray[i];
        }

        array[numberOfObjects + 1] = object;

        return array;
    }

    public static void printArray(Object[] array){
        System.out.println("Current array size: " + array.length);

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                System.out.println(index + " - " + array[i].toString());
                index++;
            }
        }
    }


    private static int consoleInput(int arraySize) throws IOException {
        int indexToRemove = 0;
        String objectToRemove = "";

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter consoleWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        consoleWriter.write("Pick an index to remove:");
        consoleWriter.flush();

        objectToRemove = consoleReader.readLine();

        if (objectToRemove.contains("[a-zA-Z]+")){
            consoleInput(arraySize);
            consoleWriter.write("Input not valid.");
            consoleWriter.flush();
            return -1;
        }

        if (Integer.parseInt(objectToRemove) > arraySize){
            consoleInput(arraySize);
            consoleWriter.write("Input not valid.");
            consoleWriter.flush();
            return -1;
        }

        indexToRemove = Integer.parseInt(objectToRemove);

        return indexToRemove;
    }

    public static Object[] removeItem(Object[] array) throws IOException {

        printArray(array);

        int indexToRemove = consoleInput(array.length);

        int numberOfObjects = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                numberOfObjects++;
            }
        }

        int jumper = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (i == indexToRemove){
                jumper++;
            }
            array[i] = array[i + jumper];
        }

        array[numberOfObjects - 1] = null;

        if ((array.length/2) > (numberOfObjects-1)){
            Object[] newArray = new Object[Math.round(array.length/2)];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            return newArray;
        }
        return array;
    }

}
