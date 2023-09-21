import java.util.Scanner;

public class Gradecalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // Define the number of subjects
            int numSubjects;
            System.out.print("Enter the number of subjects: ");
            numSubjects = scanner.nextInt();

            // Initialize variables for total marks and average percentage
            double totalMarks = 0;

            // Input marks for each subject and calculate total marks
            for (int i = 1; i <= numSubjects; i++) {
                System.out.print("Enter marks obtained in subject " + i + ": ");
                double marks = scanner.nextDouble();

                // Validate that marks are within the range [0, 100]
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid input. Marks should be between 0 and 100.");
                    return; // Exit the program if input is invalid
                }

                totalMarks += marks;
            }
            // Close the scanner
            scanner.close();

            // Calculate the average percentage
            double averagePercentage = (totalMarks / (numSubjects * 100)) * 100;

            // Assign grades based on average percentage
            String grade;
            if (averagePercentage >= 90) {
                grade = "A+";
            } else if (averagePercentage >= 80) {
                grade = "A";
            } else if (averagePercentage >= 70) {
                grade = "B";
            } else if (averagePercentage >= 60) {
                grade = "C";
            } else if (averagePercentage >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Display the total marks obtained, average percentage, and grade
            System.out.println("Total Marks Obtained: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);

        
    }
}
