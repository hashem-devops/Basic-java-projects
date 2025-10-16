import java.util.Scanner;

public class TemperatureChecker {
    public static void main(String[] args) {
        // Declare Variables
        Scanner scanner;
        double temperature;

        // Welcome Message
        System.out.println("WHAT IS THE TEMPERATURE TODAY? ");

        // Initialize Scanner
        scanner = new Scanner(System.in);

        // Take Input
        temperature = scanner.nextDouble();

        // Logic
        if (temperature < 10) {
            System.out.println("Very Cold");
        } else if (temperature < 20) {
            System.out.println("Cold");
        } else if (temperature < 30) {
            System.out.println("Warm");
        } else if (temperature < 40) {
            System.out.println("Hot");
        } else {
            System.out.println("Very Hot");
        }
        scanner.close();
    }
}
