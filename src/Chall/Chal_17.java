package Chall;

public class Chal_17 {


    public static boolean isEvenNumber(int number) {


        if (number % 2 == 0) {
            for (int i = 1; i <= 20; i++) {


                System.out.println(i);


            }
            return true;
        } else {
            return false;

        }


    }


    public static void main(String[] args) {
        isEvenNumber(2);
    }


}
