import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
         String[] msg = "Hello World!".split(" ");
         System.out.println(msg[0] +"*"+ msg[1]);
         System.out.println("Hello, World!".substring(7));


        System.out.println(3 == "3.1".length());
        System.out.println(Boolean.parseBoolean("true"));

        int a; // declaration
        a = 2345; // assignment
        int b = 123; // declaration and initialisation
        double c = 123.456;
        String name = "Adam";
        name += "\sAlrasi";
        a = 1;
        System.out.println(name + a);

        String firstName = "Adam";
        String lastName = "Alrasi";
        int age = 24;

        System.out.println(firstName + " " + lastName + " " + age);

        // Adam's last name is "Alrasi"
        System.out.println(firstName + "'s last name is \"" + lastName + "\"");

        String msg = "Python is the best programming language";
        String newMsg = msg.replace("Python", "Java");
        System.out.println(newMsg);


        // Managing film certification details
        int ageOfViewer = 15;
        if(ageOfViewer < 15){
            System.out.println("U, PG, and 12 films are available");
        } else if(ageOfViewer < 18){
            System.out.println("U, PG, 12 and 15 films are available");
        } else {
            System.out.println("all films are available");
        }
        // Time of day
        int timeOfDay = 6;
        // && means logical AND
        // || means logical OR
        if (timeOfDay >= 0 && timeOfDay <= 12) {
            System.out.println("Good morning!");
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }


        Integer[] myIntArr = {23, 24, 24, 25, 25, 26};
        java.util.List<Integer> myList = java.util.Arrays.asList(myIntArr);
        java.util.ArrayList<Integer> myArrList = new java.util.ArrayList<Integer>(myList);
        myList.set(2, 2);
        System.out.println(myIntArr[myIntArr.length - 1]);
        myArrList.add(5);
        if(myArrList.contains(2)){
            System.out.println("True");
        }
        for(int num: myArrList){
            System.out.println(num);
        }


//        java.util.HashMap<String, String> map = new java.util.HashMap<String, String>();
//        map.put("Adam", "0753");
//        map.put("Jane", "0332");
//        map.put("Tim", "0832");
//        map.put("Adam", "753");
//        for(java.util.Map.Entry<String, String> element: map.entrySet()){
//            System.out.println(element.getKey());
//        }

        java.util.HashMap<String, String> map = new java.util.HashMap<String, String>();
        map.put("att", "94");
        map.put("def", "71");
        map.put("speed", "91");
        map.remove("att");

        for(Map.Entry<String, String> element: map.entrySet()){
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }

        boolean loopControl = true;
        while(loopControl){

        }

        int count = 0;
        while(count <= 10){
            if(count % 2 == 0){
            System.out.println(count);
                }
            count++;
        }

        int count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count <= 10);



        Random random = new Random();
        System.out.println(random.nextInt(10)+1);
        Scanner scan = new Scanner(System.in);
        boolean gameContinue = true;
        int randomNum = random.nextInt(100) + 1;
        int guess = scan.nextInt();
        System.out.println(guess);
        while(gameContinue){
            if(randomNum == guess){
                System.out.println("Well done");
            } else if(randomNum > guess){
                System.out.println("Too low");
            } else if(randomNum < guess) {
                System.out.println("Too High");
            }
            gameContinue = false;

        }



//        Random random = new Random();
//        Scanner scan = new Scanner(System.in);
//
//        boolean gameContinue = true;
//        int randomNumb = random.nextInt(10)+1;
//
//        while(gameContinue){
//            System.out.println("Please guess a number🙌 from 1 to 10: ");
//            int guess = scan.nextInt();
//            if(guess <= 0 || guess > 10){
//                System.out.println("Pick number from 1 to 10");
//            }
//            if(guess > randomNumb){
//                System.out.println("Too high👆");
//            } else if(guess < randomNumb){
//                System.out.println("Too Low👇");
//            } else {
//                System.out.println("Well Done🥳");
//                gameContinue = false;
//            }
//        }

        int[] intArr = {1, 4, 6, 8, 234, 456, 234243, 34};
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Adam");
        nameList.add("Tom");
        nameList.add("Chloe");
        nameList.add("Abdul");

        // for each loop
        for(int element: intArr){
            System.out.println(element);
        }
        for(String element: nameList){
            System.out.println(element);
        }

        // for loop
        for(int i = 0; i < intArr.length; i++){
            System.out.println("idx numb: " + i + " is " + intArr[i]);
        }

        for(int i = 0; i < nameList.size(); i++){
            System.out.println("idx numb: " + i + " is " + nameList.get(i));
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("A: ");
        int a = scan.nextInt();
        System.out.println("Operation: ");
        String operator = scan.next();
        System.out.println("B: ");
        int b = scan.nextInt();

        if(Objects.equals(operator, "+")){
            System.out.println(add(a, b));
        }
        if(Objects.equals(operator, "/")){
            System.out.println(divide(a, b));
        }
        if(Objects.equals(operator, "*")) {
            System.out.println(multiple(a, b));
        }
        if(Objects.equals(operator, "-")) {
            System.out.println(subtract(a, b));
        }

    public static Integer add(Integer a, Integer b){
        return a + b;
    }
    public static Integer divide(Integer a, Integer b){
        return a / b;
    }
    public static Integer subtract(Integer a, Integer b){
        return a - b;
    }
    public static Integer multiple(Integer a, Integer b){
        return a * b;
    }

 */



    }

}

















