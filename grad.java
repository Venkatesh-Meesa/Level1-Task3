import java.util.Scanner;

public class grad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Student Grade Calculator");
        
        // Get the number of grades from the user
        System.out.print("Enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();
        
        // Create an array to store the grades
        double[] grades = new double[numberOfGrades];
        
        // Prompt the user to enter each grade
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade #" + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }
        
        // Calculate the sum of the grades
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        
        // Calculate the average
        double average = sum / numberOfGrades;
        
        // Display the average grade
        System.out.printf("The average grade is: %.2f%n", average);
        
        scanner.close();
    }
}
