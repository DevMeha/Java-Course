package Chall;

public class chal_v2 {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        calculateScore(true, 800, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
//PRZYKLAD WYWLONIA INNEJ FUNCKI WPISUJE DANNE W NAWIASACH I AUTOMATYCZNIE ROBI TO CO CHCIALEM W METODZIE
        calculateScore(true, 1000, levelCompleted, bonus);


        kal(10, 30);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }


    public static void kal(int wszystkieOceny, int SumaOcen) {


        int srednia = SumaOcen / wszystkieOceny;

        System.out.println(srednia);
    }


}
