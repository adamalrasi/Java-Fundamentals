import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(10) + 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please guess a number from 1 to 10!");
        int guess = scan.nextInt();
        boolean continueGame = true;
        while(continueGame){
            if(guess > random){
                System.out.println("Too High!");
            } else if(guess < random){
                System.out.println("Too Low!");
            } else {
                System.out.println("Well Done!");
                break;
            }
            System.out.println("Guess again: ");
            guess = scan.nextInt();
        }
    }
}