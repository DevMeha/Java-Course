package Chall;

public class chal_v6 {


    public static boolean hasEqualSum(int firstNumber, int secondNumber, int lastNumber) {
        return (firstNumber + secondNumber) == lastNumber;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));   // false
        System.out.println(hasEqualSum(1, 1, 2));   // true
        System.out.println(hasEqualSum(5, -2, 3));  // true
        System.out.println(hasEqualSum(10, 5, 20)); // false
    }


// Challenge: Napisz metodę, która przyjmuje trzy liczby całkowite i zwraca true,
// jeśli suma pierwszych dwóch liczb jest równa trzeciej, w przeciwnym razie false.


}
