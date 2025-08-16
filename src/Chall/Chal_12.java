package Chall;

public class Chal_12 {


    public static void main(String[] args) {
        printEqual(-2, 3, 2);
    }


    // Metoda printEqual przyjmuje trzy liczby całkowite jako argumenty
    public static void printEqual(int firstNumber, int secondNumber, int lastNumber) {

        // Sprawdzamy, czy którakolwiek z liczb jest mniejsza niż 0
        // Jeśli tak – wypisujemy "Invalid Value"
        if (firstNumber < 0 || secondNumber < 0 || lastNumber < 0) {
            System.out.println("Invalid Value");

            // Jeśli wszystkie trzy liczby są równe – wypisujemy "All numbers are equal"
        } else if (firstNumber == secondNumber && secondNumber == lastNumber) {
            System.out.println("All numbers are equal");

            // Jeśli wszystkie liczby są różne od siebie (każda para się różni)
            // wypisujemy "All numbers are different"
        } else if (firstNumber != secondNumber && firstNumber != lastNumber && secondNumber != lastNumber) {
            System.out.println("All numbers are different");

            // W przeciwnym razie – tzn. tylko dwie liczby są równe – wypisujemy:
            // "Neither all are equal or different"
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}





/*
 * Crafting An Equality Printer To Explore Multiple Conditional Checks In Java
 *
 * Write a method named printEqual with 3 parameters of type int.
 * The method should not return anything (void).
 *
 * Your method should use conditional logic to check the values and print the appropriate message:
 *
 * - If any of the parameters is less than 0, print: "Invalid Value"
 * - If all three numbers are equal, print: "All numbers are equal"
 * - If all three numbers are different, print: "All numbers are different"
 * - Otherwise (only two numbers are equal), print: "Neither all are equal or different"
 *
 * EXAMPLES OF INPUT/OUTPUT:
 *
 * printEqual(1, 1, 1);      → prints "All numbers are equal"
 * printEqual(1, 1, 2);      → prints "Neither all are equal or different"
 * printEqual(-1, -1, -1);   → prints "Invalid Value"
 * printEqual(1, 2, 3);      → prints "All numbers are different"
 */