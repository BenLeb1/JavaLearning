import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        while (true) {

            System.out.println("Calculator starting...");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.println("Select operation:");
            char operation = input.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            switch (operation) {
                case '+':
                    double addResult = num1 + num2;
                    System.out.println("Result: " + addResult);
                    break;
                case '-':
                    double subResult = num1 - num2;
                    System.out.println("Result: " + subResult);
                    break;
                case '*':
                    double mulResult = num1 * num2;
                    System.out.println("Result: " + mulResult);
                    break;
                case '/':
                    if(num2 == 0) {
                        System.out.println("Error: Cannot divide by zero");
                    } else {
                        double divResult = num1 / num2;
                        System.out.println("Result: " + divResult);
                        break;
                    }
                default:
                    System.out.println("Please enter only valid operators");
                
            }
            System.out.println("Do another calculation (y/n): ");
            char restart = input.next().charAt(0);

            if (restart == 'n') {
                input.close();
                break;
            }
        }

    }
}


