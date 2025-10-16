        import java.util.Scanner;

        public class SimpleCalculator {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("ENTER YOUR FIRST NUMBER: ");
                double num1 = scanner.nextDouble();

                System.out.println("ENTER YOUR SECOND NUMBER: ");
                double num2 = scanner.nextDouble();

                System.out.println("ENTER YOUR OPERATOR (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

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
                        System.out.println("ERROR: Division by zero!");
                    }
                }  else {
                    System.out.println("Invalid Operator");
                }
            }
        }
