package hangman.model;

public class PowerScore implements GameScore{
    /**
     *@pos result = result + 5**correctCount
     *@pos result = result - 8 ** incorrectCount
     *@pos result >= 0
     *@pos result <= 500
     **/
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
