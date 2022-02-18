package academy.mindswap;

import java.util.*;

public class DupeFinder<T>  {

    private final Collection<T> collection;
    private final Set<T> set;

    public DupeFinder(Collection<T> collection){
        this.collection = collection;
        this.set = new HashSet<>(collection);
    }

    public int checkDupes(){
       return collection.size()-set.size();
    }

    public List<T> getDupes(){
        List<T> dif = new ArrayList<>(collection);
        for (T element: set) {
            dif.remove(element);
        }

        return dif;
    }
}
