package Chall;

public class chal_v1 {

    public static void main(String[] args) {


//        Step 1:  create a double variable with a value of 20.00.
        double firstVariable = 20.00D;
//        Step 2:  create a second variable of type double with a value 80.00.
        double secondVariable = 80.00D;
//        Step 3:  add both numbers together, then multiply by 100.00.
        double addNumber = firstVariable + secondVariable * 100.00D;
        System.out.println("MyValueTotal:" + addNumber);
//        Step 4:  use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 40.00, will be.
        double remainderOperation = addNumber % 40.00D;
        System.out.println("Remainder:" + remainderOperation);
//        Step 5:  create a boolean variable that assigns the value true, if the remainder in step four is 0.00, or false if it's not zero.
        boolean assignVariable = (remainderOperation == 0) ? true : false;

//        Step 6:  output the boolean variable just to see what the result is.
        System.out.println("isNoRemainder " + assignVariable);
//        Step 7:  write an if-then statement that displays a message, 'got some remainder', if the boolean in step five is not true.
        if (!assignVariable) {
            System.out.println("Got some remainder");
        }


    }
}
