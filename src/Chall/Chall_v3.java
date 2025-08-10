package Chall;

public class Chall_v3 {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(250);
        displayHighScorePositon("Adam", position);

    }

    public static void displayHighScorePositon(String namePlayer, int highScorePosition) {
        System.out.println(namePlayer + " managed to get " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}


/*
TREŚĆ ZADANIA:
Stwórz program, który będzie obliczał pozycję gracza na liście najlepszych wyników
na podstawie zdobytych punktów i wyświetlał odpowiedni komunikat.

Wymagania:
1. Napisz metodę calculateHighScorePosition(int playerScore), która:
   - Zwraca 1, jeśli playerScore >= 1000
   - Zwraca 2, jeśli playerScore >= 500 i mniej niż 1000
   - Zwraca 3, jeśli playerScore >= 100 i mniej niż 500
   - Zwraca 4, jeśli playerScore < 100

2. Napisz metodę displayHighScorePositon(String namePlayer, int highScorePosition), która:
   - Wyświetli komunikat w formacie:
     "<imię gracza> managed to get <pozycja> on the high score list"

3. W metodzie main:
   - Wywołaj calculateHighScorePosition z dowolną liczbą punktów
   - Wynik przypisz do zmiennej
   - Wywołaj displayHighScorePositon, przekazując imię gracza i jego pozycję
*/