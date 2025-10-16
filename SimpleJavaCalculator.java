import java.util.Scanner;

public class SimpleJavaCalculator {
    public static void main(String[] args) {
        // Declare all variables
        Scanner scanner;
        double num1;
        double num2;
        char operator;

        // Initialize Scanner
        scanner = new Scanner(System.in);

        // Take user input
        System.out.println("ENTER YOUR FIRST NUMBER: ");
        num1 = scanner.nextDouble();

        System.out.println("ENTER YOUR SECOND NUMBER: ");
        num2 = scanner.nextDouble();

        System.out.println("ENTER YOUR OPERATOR: ");
        operator = scanner.next().charAt(0);

        // Perform Calculations
        if (operator == '+') {
            System.out.println("Result = " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result = " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result = " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            } else {
                System.out.println("ERROR: Division by zero is undefined!");
            }
        } else {
            System.out.println("Invalid Operator");
        }
        scanner.close();
    }
}
