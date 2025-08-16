package Chall;

public class Chal_11 {

    public static void main(String[] args) {
        // Wywołanie metody z przykładową liczbą minut (4353 minuty)
        printYearsAndDays(4353);
    }

    // Metoda przelicza podaną liczbę minut na lata i dni.
    // Nie zwraca nic (void), tylko drukuje wynik lub komunikat o błędzie.
    public static void printYearsAndDays(long minutes) {

        // Jeśli liczba minut jest mniejsza niż 0, wypisz błąd
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            // Krok 1: konwersja minut na godziny
            long hours = minutes / 60;

            // Krok 2: konwersja godzin na pełne dni
            long totalDays = hours / 24;

            // Krok 3: obliczanie liczby pełnych lat (ile razy 365 zmieści się w totalDays )
            long years = totalDays / 365;

            // Krok 4: obliczanie pozostałych dni po odjęciu pełnych lat
            long remainingDays = totalDays % 365;

            // Krok 5: wypisanie wyniku zgodnie z formatem zadania
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
