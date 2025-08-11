package Chall;

public class chal_v4 {

    public static class SpeedConverter {

        public static long toMilesPerHour(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                return -1;
            } else {

                return Math.round(kilometersPerHour / 1.609);

            }
        }


        public static void printConversion(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                System.out.println("Invalid Value");
            } else {

                System.out.println(kilometersPerHour + " km/h = " + SpeedConverter.toMilesPerHour(kilometersPerHour) + " mi/h");
            }

        }


    }

    public static void main(String[] args) {


        System.out.println(chal_v4.SpeedConverter.toMilesPerHour(1.5));
        System.out.println(chal_v4.SpeedConverter.toMilesPerHour(10.25));
        System.out.println(chal_v4.SpeedConverter.toMilesPerHour(-5.6));
        System.out.println(chal_v4.SpeedConverter.toMilesPerHour(25.42));
        System.out.println(chal_v4.SpeedConverter.toMilesPerHour(75.114));
        SpeedConverter.printConversion(2);

    }

}
//Task


// 1. Napisz metodę o nazwie toMilesPerHour, która przyjmuje 1 parametr typu double o nazwie kilometersPerHour.
// Metoda ta powinna zwrócić zaokrągloną wartość wyniku obliczenia typu long.

// Jeśli parametr kilometersPerHour jest mniejszy niż 0, metoda toMilesPerHour powinna zwrócić -1,
// aby wskazać nieprawidłową wartość.

// W przeciwnym razie, jeśli jest to wartość dodatnia, należy obliczyć wartość prędkości w milach na godzinę,
// zaokrąglić ją i zwrócić wynik. Użyj w tym celu metody Math.round().


// 2. Napisz metodę o nazwie printConversion, która przyjmuje 1 parametr typu double o nazwie kilometersPerHour.

// Metoda ta nie powinna nic zwracać (typ void) i powinna obliczyć prędkość w milach na godzinę z parametru kilometersPerHour.

// Następnie powinna wydrukować komunikat w formacie "XX km/h = YY mi/h".

// XX to pierwotna wartość kilometersPerHour, a YY to zaokrąglona wartość prędkości w milach na godzinę uzyskana z parametru kilometersPerHour.

// Jeśli parametr kilometersPerHour jest mniejszy niż 0, metoda powinna wydrukować tekst "Invalid Value".
