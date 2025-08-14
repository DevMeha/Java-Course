package Chall;

public class Chal_v8 {


    public static double convertToCentimeters(int totalHighInches) {

        return totalHighInches * 2.54;

        
    }


    public static double convertToCentimeters(int highInFeet, int highInChes) {


        int totalInChes = (highInFeet * 12) + highInChes;
        return convertToCentimeters(totalInChes);


    }

    public static void main(String[] args) {


        System.out.println("In one parameter " + convertToCentimeters(23));
        System.out.println("In two parameter " + convertToCentimeters(20, 12));


    }

}
