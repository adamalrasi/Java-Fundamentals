import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ScrabbleScore scorer = new ScrabbleScore();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or - to exit");
        String word = scan.next();
        while(!word.equals("-")){
            System.out.println(scorer.getScrabbleScore(word));
            System.out.println("Enter a word or - to exit");
            word = scan.next();
        }
    }
}