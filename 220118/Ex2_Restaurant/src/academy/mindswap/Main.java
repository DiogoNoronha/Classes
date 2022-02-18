package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Restaurant rest1 = new Restaurant("O Chouriço", 5);
        Restaurant rest2 = new Restaurant("SóSushi", 2);
        rest1.clientIn("Manel");
        rest1.clientIn("Maria");
        rest1.clientIn("Quim");
        rest1.clientIn("Zé");
        rest1.clientIn("Alfredo");
        rest1.clientIn("Joaquina");

        rest1.clientOut("Manel");
        rest1.clientPay("Manel");
        rest1.clientOut("Manel");
        rest1.clientIn("Joaquina");

        rest2.clientIn("Manel");
        rest2.clientIn("Rita");
        rest2.clientIn("Mãe da Rita");
    }
}
