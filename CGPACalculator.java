//Intern NITI Internship
//Domain Name -> Java Programming
//Task 4 -> (CGPACalculator)
//Intern Name -> Dhiraj Kumar

import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------Welcome To The CGPA Calculator!---------------\n");
        System.out.print("Enter the total number of subjects: ");
        int totalSubjects = scanner.nextInt();

        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.println("\nSubject " + i + ":");
            System.out.print("Enter Grade (A, B, C, D, F): ");
            String grade = scanner.next();
            System.out.print("Enter Credit Hours: ");
            double credits = scanner.nextDouble();

            double gradePoint = calculateGradePoint(grade);
            if (gradePoint == -1) {
                System.out.println("Invalid Grade entered. Exiting.");
                return;
            }
            totalGradePoints += gradePoint * credits;
            totalCredits += credits;
        }

        double cgpa = totalGradePoints / totalCredits;
        System.out.printf("\nYour CGPA is: %.2f\n", cgpa);

        scanner.close();
    }

    private static double calculateGradePoint(String grade) {
        switch (grade.toUpperCase()) {
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return -1;
        }
    }
}
