import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        // Declare variables
        Scanner scanner;
        int units;
        int rate;
        int totalBill;
        String name;

        // Welcome Message
        System.out.println("*** ELECTRICITY BILL CALCULATOR ***");

        // Initialize Scanner
        scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("What is your name? ");
        name = scanner.next();

        System.out.print("Enter the units (kWh) you have consumed: ");
        units = scanner.nextInt();

        // Logic
        if (units < 0) {
            System.out.println("Invalid input! Units cannot be negative.");
            scanner.close();
            return;
        }

        if (units <= 100) {
            rate = 5;
        } else if (units <= 200) {
            rate = 7;
        } else if (units <= 300) {
            rate = 10;
        } else {
            rate = 15;
        }

        // Calculations
        totalBill = units * rate;

        // Display results
        System.out.println("-----------------------------");
        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + units + " kWh");
        System.out.println("Rate per unit: Gh¢" + rate);
        System.out.println("Total Bill: Gh¢" + totalBill);
        System.out.println("-----------------------------");
        System.out.println("Thank you for using our service!");

        // Close scanner
        scanner.close();
    }
}
