public class ScrabbleScore{
    String[] POINT_SCORE_LETTER = {"AEIOULNRST", "DG", "BCMP", "FHVWY", "K", "JX", "QZ"};
    int[] POINT_SCORE = {1, 2, 3, 4, 5, 8, 10};

    public int getScrabbleScore(String word){
        int wordScore = 0;
        for(char letter: word.toUpperCase().toCharArray()){
            for(int i = 0; i < POINT_SCORE_LETTER.length; i++){
                if(POINT_SCORE_LETTER[i].indexOf(letter) != -1){
                    wordScore += POINT_SCORE[i];
                }
            }
        }
        return wordScore;
    }
}
