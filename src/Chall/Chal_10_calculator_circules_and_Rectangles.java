package Chall;

public class Chal_10_calculator_circules_and_Rectangles {


    public static void main(String[] args) {
        System.out.println("Area of a circle is: " + area(4));
        System.out.println("Area of a rectangle is: " + area(2, 4));
    }

    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;

        }
        return Math.PI * radius * radius;

    }


    public static double area(double x, double y) {


        if (x < 0 || y < 0) {
            return -1.0;

        } else {

            return x * y;


        }

    }


}

//ZADNAIE

/*
1. Constructing A Comprehensive Area Calculator For Circles And Rectangles In Java

2. Write a method named `area` with one double parameter named `radius`.

3. The method must return a double value that represents the area of a circle.

4. If the parameter `radius` is negative, return -1.0 to indicate an invalid value.

5. Write another overloaded method named `area` with two parameters: `x` and `y` (both of type double),
   where `x` and `y` represent the sides of a rectangle.

6. The method must return the area of the rectangle.

7. If either or both parameters (`x` or `y`) are negative, return -1.0 to indicate an invalid value.

8. For formulas and the value of PI, please refer to the tips below:
   - Area of a circle: π × radius²
   - Area of a rectangle: x × y
   - Use Math.PI for the value of π in Java

9. Examples of input/output:

   a) area(5.0);             → should return 78.53981633974483 or 78.53981
   b) area(-1);              → should return -1 since the parameter is negative
   c) area(5.0, 4.0);        → should return 20.0 (5 * 4 = 20)
   d) area(-1.0, 4.0);       → should return -1 since the first parameter is negative
*/



