import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        Scanner scan = new Scanner(System.in);
        System.out.println("Which operation? (a or s, x to Exit):");
        String choice = scan.next();

        while(!choice.equals("x")){
        System.out.println("Enter the first number:");
        int firstNumb = scan.nextInt();
        System.out.println("Enter the second number:");
        int secNumb = scan.nextInt();

        if(choice.equals("a")){
            System.out.println(calc.add(firstNumb, secNumb));
        }
        if(choice.equals("s")){
            System.out.println(calc.subtract(firstNumb, secNumb));
        }
            System.out.println("Which operation? (a or s, x to Exit):");
            choice = scan.next();
        }
    }
}
