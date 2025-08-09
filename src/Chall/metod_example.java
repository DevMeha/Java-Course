package Chall;

public class metod_example {

    // ================================
    // 1. Metoda nic nie zwracająca (void)
    // ================================
    // - używamy, gdy metoda wykonuje jakąś akcję,
    //   ale nie potrzebujemy wyniku (np. wypisanie tekstu)
    public static void przywitaj() {
        System.out.println("Cześć!");
    }

    // ================================
    // 2. Metoda zwracająca liczbę całkowitą (int)
    // ================================
    // - musi zwrócić wartość typu int przy pomocy return
    public static int dodaj(int a, int b) {
        return a + b;
    }

    // ================================
    // 3. Metoda zwracająca wartość logiczną (boolean)
    // ================================
    // - musi zwrócić true lub false
    public static boolean jestParzysta(int liczba) {
        return liczba % 2 == 0;
    }

    // ================================
    // 4. Przykład metody z obliczaniem punktów
    // ================================
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    // ================================
    // 5. Przykład metody liczącej średnią
    // ================================
    public static void kal(int wszystkieOceny, int sumaOcen) {
        int srednia = sumaOcen / wszystkieOceny;
        System.out.println("Średnia: " + srednia);
    }

    // ================================
    // Metoda main – punkt startowy programu
    // ================================
    public static void main(String[] args) {

        // 1. Wywołanie metody void
        przywitaj();

        // 2. Wywołanie metody int
        int wynikDodawania = dodaj(5, 3);
        System.out.println("Wynik dodawania: " + wynikDodawania);

        // 3. Wywołanie metody boolean
        int liczba = 4;
        if (jestParzysta(liczba)) {
            System.out.println(liczba + " jest parzysta");
        } else {
            System.out.println(liczba + " jest nieparzysta");
        }

        // 4. Wywołanie metody calculateScore
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 1000, 8, 200);

        // 5. Wywołanie metody kal (średnia)
        kal(10, 30);
    }
}

/*
PODSUMOWANIE:
- void    → metoda nic nie zwraca (return nie jest wymagane)
- int     → metoda musi zwrócić liczbę całkowitą (return <liczba>)
- boolean → metoda musi zwrócić true/false (return true/false)
*/
