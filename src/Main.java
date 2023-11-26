import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");

        // Read the number of students
        int numberOfStudents = scanner.nextInt();

        // Validate that the number of students is greater than 0
        if (numberOfStudents <= 0) {
            System.out.println("Please enter a valid number of students.");
            return; // Exit the program
        }

        // Initialize variables for total marks and average marks
        int totalMarks = 0;

        // Loop through each student to input their marks
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int studentMarks = scanner.nextInt();

            // Add the student's marks to the total
            totalMarks += studentMarks;
        }

        // Calculate the average marks
        double averageMarks = (double) totalMarks / numberOfStudents;

        // Output the average marks
        System.out.println("Average marks of the students: " + averageMarks);

        // Close the Scanner to release system resources
        scanner.close();
    }
}