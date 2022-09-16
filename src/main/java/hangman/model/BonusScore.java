package hangman.model;

public class BonusScore implements GameScore{
    /***
     *@pos result = result + 10 * correctCount
     *@pos result = result -5 * incorrectCount
     *@pos result >= 0
     **/
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
