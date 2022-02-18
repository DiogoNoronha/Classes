package academy.mindswap;

public class StolenNumber {

    public static void main(String[] args) {
	// write your code here

        findStolenNumber(new int[]{1,2,3,5,6,7,8,9,10});
        findStolenNumber(new int[]{1,2,3,4,5,6,7,8,10});
        findStolenNumber(new int[]{1,2,3,4,5,6,7,8,9,10});
    }

    public static void findStolenNumber(int[] numbers){
        int add = 0;
        for (int i = 0; i < numbers.length; i++) {
            add += numbers[i];
        }
        if(add == 55){
            System.out.println("Não falta nenhum numero");
        } else {
            int res = 55 - add;
            System.out.println("Falta o numero " + res);
            }
        }
    }


