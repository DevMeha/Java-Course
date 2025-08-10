package Chall;

public class Chall_v3 {

    public static void displayHighScorePositon(String namePlayer, int playerPosition) {


        System.out.println("Tim managed to get into position on the high score list");

    }


    public static int calculateHighScorePosition(int playerScore) {


        if (playerScore >= 1000) {

            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {

            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;

        } else {
            return 4;
        }


    }
}
