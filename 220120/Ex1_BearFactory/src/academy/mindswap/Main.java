package academy.mindswap;

import academy.mindswap.bears.Bear;

public class Main {

    public static void main(String[] args) {
	Shop toysAreUs = new Shop();
    Shop centroXogo = new Shop();

    Bear bear1 = toysAreUs.createBear();
    Bear bear2 = toysAreUs.createBear();
    Bear bear3 = toysAreUs.createBear();
    Bear bear4 = toysAreUs.createBear();
    Bear bear5 = toysAreUs.createBear();

    System.out.println(toysAreUs.getNumberOfBearsCreated());

        for (int i = 0; i < 101; i++) {
            System.out.println(bear5.talk());
        }
    }
}
