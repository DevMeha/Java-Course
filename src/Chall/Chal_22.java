package Chall;

public class Chal_22 {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {
        // Definiujemy metodę isPerfectNumber, która przyjmuje jeden parametr typu int (number)
        // i zwraca wartość boolean (true lub false)


        if (number < 1) {
            // Sprawdzamy, czy liczba jest mniejsza niż 1
            return false;
            // Jeśli tak, od razu zwracamy false (bo liczba doskonała musi być dodatnia)
        }

        int sum = 0;
        // Tworzymy zmienną sum i ustawiamy ją na 0 (będzie przechowywać sumę dzielników właściwych)

        for (int i = 1; i < number; i++) {
            // Pętla sprawdza wszystkie liczby od 1 do number-1
            // (bo nie bierzemy samej liczby jako dzielnika)

            if (number % i == 0) {
                // Jeśli i dzieli number bez reszty (czyli jest dzielnikiem)
                sum += i;
                // Dodajemy i do sumy dzielników
            }
        }

        return sum == number;
        // Zwracamy true, jeśli suma dzielników jest równa liczbie
        // W przeciwnym razie zwracamy false
    }


/*
-----------------------------------------
TASK DESCRIPTION (in English)
-----------------------------------------

Confirming Perfect Numbers Through Sum Of Proper Divisors

What is the perfect number?
A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.

For example, take the number 6:
Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded),
and the sum of its proper divisors is 1 + 2 + 3 = 6.

Therefore, 6 is a perfect number (as well as the first perfect number).

Task:
Write a method named isPerfectNumber with one parameter of type int named number.
- If number is < 1, the method should return false.
- The method must calculate if the number is perfect.
- If the number is perfect, the method should return true; otherwise, it should return false.

*/

}
