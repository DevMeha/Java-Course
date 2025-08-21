package Chall;

public class Chal_v16 {
    public class SumOddRange {

        public static boolean isOdd(int number) {
            // Sprawdzamy, czy liczba jest większa od 0 i nieparzysta
            if (number > 0 && number % 2 == 1) {
                return true;  // Jeśli tak, zwracamy true
            } else {
                return false; // W przeciwnym razie zwracamy false
            }
        }

        public static int sumOdd(int start, int end) {
            // Sprawdzamy, czy start i end są poprawne (większe od 0, end >= start)
            if (start <= 0 || end <= 0 || end < start) {
                return -1;  // Jeśli nie, zwracamy -1 jako błąd
            }

            int sum = 0;  // Zmienna do przechowywania sumy nieparzystych liczb

            // Pętla od start do end włącznie
            for (int i = start; i <= end; i++) {
                // Sprawdzamy, czy liczba i jest nieparzysta, wywołując metodę isOdd
                if (isOdd(i)) {
                    sum += i; // Jeśli tak, dodajemy ją do sumy
                }
            }

            return sum; // Zwracamy ostateczną sumę liczb nieparzystych
        }

    }

}


