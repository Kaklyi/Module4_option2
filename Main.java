
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Variables to store statistics
        double sum = 0; // total of all grades
        double max = Double.NEGATIVE_INFINITY; // start with smallest possible value
        double min = Double.POSITIVE_INFINITY; // start with largest possible value

        // Loop will collect 10 grades from the user
        for (int i = 1; i <= 10; i++) {

            System.out.print("Please enter the grade of student #" + i + ": ");

            // Validate input to ensure a number is entered
            while (!input.hasNextDouble()) {
                System.out.println("Error: Invalid input. Please enter a numeric grade.");
                input.next(); // discard the invalid input
                System.out.print("Please enter the grade of student #" + i + ": ");
            }

            // Read the valid grade
            double grade = input.nextDouble();

            // Add grade to the total sum
            sum += grade;

            // Update maximum grade if current grade is higher
            if (grade > max) {
                max = grade;
            }

            // Update minimum grade if current grade is lower
            if (grade < min) {
                min = grade;
            }
        }

        // Calculate the average grade
        double average = sum / 10;

        // Display the results
        System.out.println("\nThe following show the Grade Statistics:");
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Close the scanner to free resources
        input.close();
    }
}