import java.util.Scanner;
public class cond5{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Read scores for 4 subjects
            System.out.print("Enter the score for Subject 1: ");
            double subject1 = scanner.nextDouble();
            
            System.out.print("Enter the score for Subject 2: ");
            double subject2 = scanner.nextDouble();
            
            System.out.print("Enter the score for Subject 3: ");
            double subject3 = scanner.nextDouble();
            
            System.out.print("Enter the score for Subject 4: ");
            double subject4 = scanner.nextDouble();
            
            // Calculate the total score and percentage
            double totalScore = subject1 + subject2 + subject3 + subject4;
            double percentage = (totalScore / 400) * 100; // Assuming each subject is out of 100
            
            // Determine the grade
            String grade;
            if (percentage < 35) {
                grade = "F";
            } else if (percentage < 45) {
                grade = "D";
            } else if (percentage < 55) {
                grade = "C";
            } else if (percentage < 75) {
                grade = "B"; // Changed to B for consistency
            } else {
                grade = "A";
            }
            
            // Print the results
            System.out.printf("Total Percentage: %.2f%%\n", percentage);
            System.out.println("Grade: " + grade);
            
            scanner.close();
        }
    }
    

