package academy.mindswap;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

	Object[] array1 = new Object[2];
    Object[] array2 = new Object[4];
    Object obj1 = new Object();
    Object obj2 = new Object();
    Object obj3 = new Object();
    Object obj4 = new Object();
    Object obj5 = new Object();

    array1 = EditArray.addItem(array1, obj1);
    array1 = EditArray.addItem(array1, obj2);
    array1 = EditArray.addItem(array1, obj3);

    EditArray.removeItem(array1);

    EditArray.printArray(array1);
    }
}
