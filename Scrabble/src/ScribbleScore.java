public class ScribbleScore {
    final static String[] POINT_SCORE_LETTERS = { "AEIQUOLNRST", "DG", "BCMP","FHVWY","K","JX","QZ"};
    final static int[] POINT_SCORES = {1, 2, 3, 4, 5, 8, 10};

    public int getScrabbleScore(String word){
        int wordScore = 0;
        for( char letter: word.toUpperCase().toCharArray()) {
            for (int i = 0; i < POINT_SCORE_LETTERS.length; i++) {
                if (POINT_SCORE_LETTERS[i].indexOf(letter) != -1) {
                    wordScore += POINT_SCORES[i];
                }
            }
        }
        return wordScore;
    }
}
