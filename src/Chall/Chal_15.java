package Chall;

public class Chal_15 {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {


            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println(i);
                sum += i;
                count++;
                if (count == 5) {
                    break;
                }
            }


        }
        System.out.println("Numbers divided by both 3 and 5 : " + count);

        System.out.println("sum numbers: " + sum);
    }

}
// =====================
// Sum 3 and 5 Challenge
// =====================
//
// * Create a for loop using a range of numbers from 1 to 1000 inclusive
//
// * Sum all the numbers that can be divided by both 3 and 5
//
// * Print out the numbers that meet the above condition
//
// * Break out of the loop once you have found 5 numbers that meet the condition
//
// * After breaking out of the loop, print the sum of the numbers that met the condition
//
// * Note: type all code in the main method


// =====================
// Sum 3 and 5 Challenge
// =====================
//
// * Utwórz pętlę for, która przechodzi przez liczby od 1 do 1000 (włącznie)
//
// * Zsumuj wszystkie liczby, które są podzielne zarówno przez 3, jak i przez 5
//
// * Wypisz te liczby, które spełniają powyższy warunek
//
// * Przerwij pętlę, gdy znajdziesz 5 takich liczb
//
// * Po przerwaniu pętli wypisz sumę tych liczb
//
// * Uwaga: cały kod powinien być napisany w metodzie main


