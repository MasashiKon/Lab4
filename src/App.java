import java.util.Scanner;

import Calculator.Calculator;;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        do {

            String operator;
            String contuinueOrQuit;

            System.out.println("Please type the first number");
            double firstNum = scan.nextDouble();

            do {

            System.out.println("Choose an operation:\n > Type + for addition\n > Type - for subtraction\n > Type * for multiplication\n > Type / for division");
            operator = scan.next();
            
            } while (!( operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") ));

            System.out.println("Please type the second number");
            double secondNum = scan.nextDouble();

            if (operator.equals("/") && secondNum == 0) {
                System.out.println("cannot divide by zero");
            } else if (operator.equals("+")) {
                System.out.println(firstNum + " " + operator + " " + secondNum + " = " + Calculator.add(firstNum, secondNum));
            } else if (operator.equals("-")) {
                System.out.println(firstNum + " " + operator + " " + secondNum + " = " + Calculator.subtract(firstNum, secondNum));
            } else if (operator.equals("*")) {
                System.out.println(firstNum + " " + operator + " " + secondNum + " = " + Calculator.multiply(firstNum, secondNum));
            } else if (operator.equals("/")) {
                System.out.println(firstNum + " " + operator + " " + secondNum + " = " + Calculator.divide(firstNum, secondNum));
            } else {
                System.out.println("Invalid input");
            }

            do {

                System.out.println("do you want to continue or quit?");

                contuinueOrQuit = scan.next();

            } while (!(contuinueOrQuit.equals("continue") || contuinueOrQuit.equals("quit")));

            if (contuinueOrQuit.equals("continue")) {

                continue;

            } else {

                System.out.println("Bye!");
                break;

            }

        } while (true);

        scan.close();

    }
}
