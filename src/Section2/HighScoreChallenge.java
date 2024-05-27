package Section2;

public class HighScoreChallenge {
    public static void main(String[] args) {
        int highScorePositionOne = calculateHighScorePosition(1500);
        displayHighScorePosition("Bala", highScorePositionOne);

        highScorePositionOne = calculateHighScorePosition(999);
        displayHighScorePosition("Bala", highScorePositionOne);

        highScorePositionOne = calculateHighScorePosition(499);
        displayHighScorePosition("Bala", highScorePositionOne);

        highScorePositionOne = calculateHighScorePosition(99);
        displayHighScorePosition("Bala", highScorePositionOne);

        highScorePositionOne = calculateHighScorePosition(-25);
        displayHighScorePosition("Bala", highScorePositionOne);




    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 100 && score < 500) return 3;
        else if (score >= 500 && score < 1000) return 2;
        else if (score >= 1000) return 1;
        else return 4;
    }

}
