public class Main {
    public static void main(String[] args) {
        int mySecoudNumber = 12;
        int myThirdNumber = 70;
        int myFirstNumber = 35;
        int myTotal = 117;
        int myLastOne = 883;
        short myMinShortValue = Short.MIN_VALUE;
        String result = getQuarter("April");


        int All = myFirstNumber + myThirdNumber + myFirstNumber + mySecoudNumber + myThirdNumber + myTotal + myLastOne;
        System.out.println(All);


//     ==============================> VARIABLES INTEGER,BYTE,SHORT,LONG AND PRINT IN CONSOLE  <===============================

//        Byte – 8-bitowa liczba całkowita ze znakiem.
//        Zakres wartości: od -128 do 127.
//
//        Short – 16-bitowa liczba całkowita ze znakiem.
//        Zakres wartości: od -32768 do 32767.
//
//        Long – 64-bitowa liczba całkowita ze znakiem.
//        Zakres wartości: od -9223372036854775808 do 9223372036854775807.

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Value Range(" + myMinValue + " to " + myMaxValue + ")");
        System.out.println("Byte Value Range(" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        System.out.println("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
        System.out.println("Long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
        System.out.println("A Long a width of" + Long.SIZE);
        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);
        byte myByteChallenge = 10;
        short myShortChallenge = 20;
        int myIntChallenge = 50;
        long myLongChalllenge = (50000L + 10 * myByteChallenge + 10 * myShortChallenge + 10 * myIntChallenge);
        System.out.println(myLongChalllenge);


//     ==============================> FLOAT AND DOUBLE  <===============================
//             **float** (32 bity) – liczba zmiennoprzecinkow, precyzja ~7 cyfr, zakres ok. ±1.4e-45 do ±3.4e+38.
//
//             **double** (64 bity) – liczba zmiennoprzecinkow

//
        System.out.println("Float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
//        PRINT: Float Value Range(1.4E-45 to 3.4028235E38
        System.out.println("Float SIZE " + Float.SIZE);
//        PRINT:Float SIZE 32


        System.out.println("Double Value Range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Double SIZE " + Double.SIZE);
//        Print:Double SIZE 64


//     ==============================> CONVERTED POUNDS TO KILOGRAMS  <===============================


        double Pounds = 200D;
        double OnePoundToKg = 0.45359237D;
        double ConvertPoundToKg = Pounds * OnePoundToKg;
        System.out.println("Converted Pounds to KG = " + ConvertPoundToKg);


//     ==============================> CHAR AND BOOLEAN  <===============================

        char myChar = '?';
        char myInicodeChar = '?';
        char myDecimalChar = 63;
        System.out.println("My Values are:" + myChar + myInicodeChar + myDecimalChar);

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;
        System.out.println(myFalseBoolean);
        System.out.println(myTrueBoolean);


        //     ==============================> String  <===============================
        String myString = "This is a string";
        System.out.println("I wish i had " + myString);

//        int result = 5;
//        result = result % 3;
//       reszta z dzielenia


        //     ==============================> OPERATORS //+/-/*/+=/-=  <===============================


//         System.out.println(result);
        int resultt = 10;
        resultt += 1; //add to result 1
        System.out.println(resultt);

        //     ==============================> IF AND(&& zwraca true jeeli 2 parametry są poprawne)  <===============================


        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not Alien");

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("High score");
        }


        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");


        }


//        && Musi byc 2 true

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }


//        || musi być minimum jedno true

        if (secondTopScore == 10 || secondTopScore < 10) {
            System.out.println("xd");
        }


        int age = 17;
        boolean result2 = (age >= 18) ? true : false;
        if (result2) {
            System.out.println("ma 18");
        } else {
            System.out.println("nie ma");
        }


        int Age3 = 20;
        String resultAge = (Age3 >= 18) ? "Ma 18 lat " : "Nie ma 18 ";


        System.out.println(resultAge);


        //     ==============================> IF ELSE  <===============================


        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 bute greater than 1000");
        } else if (score < 1000) {

            System.out.println("Your score was less than 1000");

        } else {
            System.out.println("Got here");
        }


        //     ==============================> SWITCH <===============================


//        int value = 3;
//
//
//        if(value == 1){
//
//            System.out.println("value was 1");
//
//        } else if (value == 2) {
//
//            System.out.println("Value was 2");
//
//
//        }else{
//            System.out.println("Was not 1 or 2");
//
//


//        }


        int switchValue = 1;

        switch (switchValue = 1) {

            case 1:


                System.out.println("Value was 1");
                break;

            case 2:

                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }


        String result3 = getQuarter("April");
        System.out.println(result3);

        String numberOut = litery('A');
        if (!numberOut.equals("Error number")) {

            System.out.println("Pełna nazwa to: " + numberOut);

        } else {

            System.out.println("Error");


        }


        loop();
    }

    public static String getQuarter(String month) {


        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month + "is bad";
                yield badResponse;


            }
        };


    }


//    public static String litery(char numberPrint) {
//        return switch (numberPrint) {
//            case 'A' -> "Able";
//            case 'B' -> "Baker";
//            case 'C' -> "Charlie";
//            case 'D' -> "Dog";
//            case 'E' -> "Easy";
//            default -> "Zły wpis";
//        };
//    }


    public static String litery(char numberPrint) {

        switch (numberPrint) {
            case 'A':
                return "A is able";

            case 'B':
                return "B is Baker";

            case 'C':
                return "C is Charlie";

            case 'D':
                return "D is Dog";

            case 'E':
                return "E is Easy";

            default:
                return "Error number";


        }


    }


    //     ==============================> LOOP <===============================


    public static void loop() {

        for (
                int counter = 1;
                counter <= 5; counter++) {

            System.out.println(counter);

        }

    }

}








