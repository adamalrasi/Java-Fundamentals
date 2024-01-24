import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Select Operations: a(add) or s(Subtract) or - to exit");
        String choice = scan.next();
        while(!choice.equals("-")){
            System.out.println("Number 1:");
            int numb1 = scan.nextInt();
            System.out.println("Number 2:");
            int numb2 = scan.nextInt();

            if(choice.equals("a")){
                System.out.println(calc.add(numb1, numb2));
            } else if(choice.equals("s")){
                System.out.println(calc.sub(numb1, numb2));
            }
            System.out.println("Select Operations: a(add) or s(Subtract) or - to exit");
            choice = scan.next();
        }

    }
}