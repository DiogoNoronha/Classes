package academy.mindswap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class WordHistogram implements Iterable<String> {

    private List<String> stringList;
    private HashMap<String, Integer> hashMap;

    public void analyseString (String string){
        string = string.replaceAll("\\p{Punct}", "");

        stringList = Arrays.stream(string.toLowerCase().split(" ")).toList();

        this.hashMap = new HashMap<String, Integer>();

        for (String stringFor:stringList) {
            int counter = 1;
            if (hashMap.containsKey(stringFor)){
                counter = counter + hashMap.get(stringFor);
            }
            hashMap.put(stringFor, counter);
        }
    }

    public int get(String string){
        return hashMap.get(string);
    }

    @Override
    public Iterator<String> iterator() {
        return hashMap.keySet().iterator();
    }
}





