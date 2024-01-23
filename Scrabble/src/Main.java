import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ScribbleScore scorer = new ScribbleScore();
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        while(!word.equals("-")) {
            System.out.println(scorer.getScrabbleScore(word));
            word = scan.next();
        }
    }
}