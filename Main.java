import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // attributes and their values
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;// any grade will be higher
        double min = Double.POSITIVE_INFINITY;// any grade will be lower

        // loop will go for 10 different grades from user input
        for (int i = 1; i <= 10; i++) {
            System.out.print("Please enter the grade of student #" + i + ": ");

            // prevent error by avoiding wrong iputs. if not number it will ask for grade
            // again
            while (!input.hasNextDouble()) {
                System.out.println("Error: Invalid input. Please make sure you enter a number.");
                // replace error input with new one
                input.next();
                System.out.print("Please enter the grade of student #" + i + ": ");
            }

            // compare grades with one another, the value for min and max will keep changing
            // as the loop keeps going

            double grade = input.nextDouble();

            sum += grade;

            if (grade > max) {
                max = grade;
            }

            if (grade < min) {
                min = grade;
            }
        }
        // Get the average by dividing by total number of entries
        double average = sum / 10;

        // print out results
        System.out.println("\nThe following show the Grade Statistics:");
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        // Finish, close the user input
        input.close();
    }
}