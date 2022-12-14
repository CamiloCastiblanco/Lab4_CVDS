package hangman.model;

public class OriginalScore implements GameScore{
    /**
     *@pos result = 100 - 10*incorrectCount
     *@pos result >= 0
     *@return result
     **/
    @Override
    public int calculateScore(int correctCount , int incorrectCount){
        int result = 100;
        result = result -  10*incorrectCount;
        if(result< 0 ) result = 0;
        return result;
    }

    @Override
    public int reset() {
        return 100;
    }
}
