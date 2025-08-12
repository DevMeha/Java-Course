package Chall;

public class chal_v5 {

    // Metoda printMegaBytesAndKiloBytes przelicza kilobajty na megabajty oraz resztę w kilobajtach
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        // Jeśli wartość kiloBytes jest mniejsza niż 0, wyświetl błąd
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");

        } else {
            // Obliczamy liczbę megabajtów (1 MB = 1024 KB)
            int mb = kiloBytes / 1024;

            // Obliczamy pozostałą liczbę kilobajtów po podzieleniu przez 1024
            int remainingKB = kiloBytes % 1024;

            // Wypisujemy wynik konwersji na konsolę
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKB + " KB");
        }

    }

    public static void main(String[] args) {
        // Wywołanie metody printMegaBytesAndKiloBytes z argumentem 2500 KB
        printMegaBytesAndKiloBytes(2500);
    }
}
