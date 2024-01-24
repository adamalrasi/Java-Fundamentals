import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        Scanner scan = new Scanner(System.in);
        System.out.println("Select a Operation: a(add), s(sub), m(multiple) d(divide), x to exit");
        String choice = scan.next();

        while(!choice.equals("x")){
            System.out.println("Number 1:");
            int num1 = scan.nextInt();
            System.out.println("Number 2:");
            int num2 = scan.nextInt();

            if(choice.equals("a")){
                System.out.println(calc.add(num1, num2));
            } else if(choice.equals("s")){
                System.out.println(calc.sub(num1, num2));
            } else if (choice.equals("d")){
                System.out.println(calc.divide(num1, num2));
            } else if (choice.equals("m")){
                System.out.println(calc.multiple(num1, num2));
            } else {
                System.out.println("Please select a, s, d, m for the operator!");
            }
            System.out.println("Select a Operation: Again or x to exit");
            choice = scan.next();
        }

    }
}