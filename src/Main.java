
public class Main{
    public static void main(String[] args) {
       int mySecoudNumber = 12;
       int myThirdNumber = 70;
       int myFirstNumber = 35;
       int myTotal = 117;
       int myLastOne = 883;
       short myMinShortValue = Short.MIN_VALUE ;

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
int  myMaxValue = Integer.MAX_VALUE;
System.out.println("Integer Value Range(" +  myMinValue + " to "  +   myMaxValue + ")");
System.out.println("Byte Value Range(" +  Byte.MIN_VALUE + " to "  +   Byte.MAX_VALUE + ")");
System.out.println("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
System.out.println("Long Value Range ("+ Long.MIN_VALUE + " to " + Long.MAX_VALUE+ ")");
System.out.println("A Long a width of" + Long.SIZE );
 short myNewShortValue = (short) ( myMinShortValue / 2);
 System.out.println(myNewShortValue);
 byte myByteChallenge = 10;
 short myShortChallenge = 20;
 int myIntChallenge = 50;
 long myLongChalllenge = (50000L + 10 * myByteChallenge + 10 * myShortChallenge + 10 * myIntChallenge );
 System.out.println(myLongChalllenge);



//     ==============================> FLOAT AND DOUBLE  <===============================
//             **float** (32 bity) – liczba zmiennoprzecinkow, precyzja ~7 cyfr, zakres ok. ±1.4e-45 do ±3.4e+38.
//
//             **double** (64 bity) – liczba zmiennoprzecinkow

//
        System.out.println("Float Value Range("+ Float.MIN_VALUE + " to " + Float.MAX_VALUE );
//        PRINT: Float Value Range(1.4E-45 to 3.4028235E38
        System.out.println("Float SIZE " +Float.SIZE);
//        PRINT:Float SIZE 32


        System.out.println("Double Value Range("+ Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Double SIZE " +Double.SIZE);
//        Print:Double SIZE 64



//     ==============================> CONVERTED POUNDS TO KILOGRAMS  <===============================


      double Pounds = 200D;
      double OnePoundToKg = 0.45359237D;
      double ConvertPoundToKg = Pounds * OnePoundToKg;
      System.out.println("Converted Pounds to KG = "+ConvertPoundToKg);



//     ==============================> CHAR AND BOOLEAN  <===============================

     char myChar = '?';
     char myInicodeChar = '\u003F';
     char myDecimalChar = 63;
     System.out.println("My Values are:"+myChar + myInicodeChar+ myDecimalChar);

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


        //     ==============================> OPERATORS  <===============================




//         System.out.println(result);
         int result = 10;
         result +=1;
         System.out.println(result);
    }
}




