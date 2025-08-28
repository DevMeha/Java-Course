package Chall;

public class chal_21 {


    public static void printFactors(int number) {   // Definition of the static method printFactors with one parameter 'number'

        if (number < 1) {   // Check if the number is less than 1
            System.out.println("Invalid Value");   // If true, print "Invalid Value"
        }

        // For loop: start with i = 1, repeat as long as i <= number, increment i by 1 each iteration
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {   // Check if 'i' divides 'number' without leaving a remainder
                System.out.println(i);   // If true, print the value of i (a factor of number)
            }
        }
    }
}

/*
Listing All Factors Of A Given Number
Write a method named printFactors with one parameter of type int named number.

If number is < 1, the method should print "Invalid Value".

The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).

For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.

EXAMPLE INPUT/OUTPUT:

printFactors(6); → should print 1 2 3 6
printFactors(32); → should print 1 2 4 8 16 32
printFactors(10); → should print 1 2 5 10
printFactors(-1); → should print "Invalid Value" since number is < 1

HINT: Use a while or for loop.

 */


