package Chall;

public class Chal_19 {


    public static void main(String[] args) {
        System.out.println(hasSharedDigit(23, 34));
    }

    // Metoda sprawdza, czy dwie liczby dwucyfrowe mają wspólną cyfrę
    public static boolean hasSharedDigit(int oneNumber, int secondNumber) {

        // Sprawdzamy, czy obie liczby są dwucyfrowe (10–99)
        if (oneNumber < 10 || oneNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false; // Zwraca false, jeśli którakolwiek liczba nie jest dwucyfrowa
        }

        // Rozdzielamy cyfry pierwszej liczby
        int oneTens = oneNumber / 10; // dziesiątki pierwszej liczby
        int oneOnes = oneNumber % 10; // jedności pierwszej liczby

        // Rozdzielamy cyfry drugiej liczby
        int twoTens = secondNumber / 10; // dziesiątki drugiej liczby
        int twoOnes = secondNumber % 10; // jedności drugiej liczby

        // Sprawdzamy, czy któraś cyfra jest wspólna
        if (oneTens == twoTens || oneTens == twoOnes || oneOnes == twoTens || oneOnes == twoOnes) {
            return true; // Zwraca true, jeśli jakakolwiek cyfra się powtarza
        }

        return false; // Zwraca false, jeśli żadna cyfra nie jest wspólna
    }
}


//Ten program sprawdza, czy dwie liczby dwucyfrowe mają wspólną cyfrę.
//
//Jeśli którakolwiek liczba nie jest dwucyfrowa, zwraca false.
//
//Jeśli liczby są dwucyfrowe, porównuje każdą cyfrę pierwszej liczby z każdą cyfrą drugiej.
//
//Zwraca true, jeśli znajdzie wspólną cyfrę, w przeciwnym razie false.