-import java.util.Scanner;

public class fibonacciSeries{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = scanner.nextInt();

        // Print Fibonacci series
        System.out.println("Fibonacci Series up to " + n + " terms:");

        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
}-

