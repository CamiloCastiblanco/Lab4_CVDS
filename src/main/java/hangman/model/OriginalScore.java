package hangman.model;

public class OriginalScore implements GameScore{
    /**
     *@pos result = 100 - 10*incorrectCount
     *@pos result >= 0
     *@return result
     **/
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
