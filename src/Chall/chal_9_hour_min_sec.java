package Chall;

public class chal_9_hour_min_sec {

    public static void main(String[] args) {
        // Testujemy metodę z jednym parametrem (sekundy)
        System.out.println(getDurationString(3945)); // 1h 5m 45s
        System.out.println(getDurationString(23, 45)); // 0h 23m 45s

        // Przykład z dużą liczbą sekund, żeby sprawdzić konwersję
        System.out.println(getDurationString(3665)); // 1h 1m 5s

        // Przykład błędnych danych (ujemne sekundy)
        System.out.println(getDurationString(-5)); // Invalid value

        // Przykład błędnych danych (sekundy > 59)
        System.out.println(getDurationString(10, 70)); // Invalid value
    }


    // Metoda z 1 parametrem (sekundy)
    public static String getDurationString(int seconds) {
        // Sprawdzamy, czy sekundy są poprawne (nieujemne)
        if (seconds < 0) {
            return "Invalid value";
        }

        // Przeliczamy sekundy na minuty i pozostałe sekundy
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        // Wywołujemy drugą metodę, która zwraca sformatowany czas
        return getDurationString(minutes, remainingSeconds);
    }


    // Metoda z 2 parametrami (minuty i sekundy)
    public static String getDurationString(int minutes, int seconds) {
        // Walidacja danych:
        // minuty muszą być >= 0
        // sekundy muszą być >= 0 i <= 59 (bo większe sekundy trzeba by było przerobić)
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        // Przeliczamy minuty na godziny i pozostałe minuty
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        // Zwracamy sformatowany string w formacie "XXh YYm ZZs"
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

}


// Create two overloaded methods named getDurationString.
// 1. Method with one int parameter (seconds).
// 2. Method with two int parameters (minutes, seconds).
// Both methods return a String formatted as: "XXh YYm ZZs".
// The first method converts seconds to minutes and remaining seconds,
// then calls the second method to get the formatted string.
// The second method converts minutes to hours and remaining minutes,
// then returns the formatted string.
// Validate inputs: minutes >= 0, seconds between 0 and 59.
// If inputs are invalid, return "Invalid value".
