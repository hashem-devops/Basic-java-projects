import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your exam score (0-100):" );
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A (Excellent)");
        }
        else if (score >= 80 && score <= 89) {
            System.out.println("Grade: B (Very Good)");
        }
        else if (score >= 70 && score <= 79) {
            System.out.println("Grade: C (Good)");
        }
        else if (score >= 60 && score <= 69) {
            System.out.println("Grade: D (Pass)");
        }
        else if (score >= 0 && score <= 59) {
            System.out.println("Grade: F (Fail)");
        } else {
            System.out.println("Invalid score entered!");
        }
        scanner.close();
    }
}
