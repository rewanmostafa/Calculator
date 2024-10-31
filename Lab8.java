package lab8;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        Calculator calculator = new Calculator(n);

        System.out.println("Enter the number of operations: ");
        int numOperations = scanner.nextInt();

        for (int i = 0; i < numOperations; i++) {
            System.out.println("Choose operation:");
            System.out.println("1. Factorial");
            System.out.println("2. Fibonacci");
            System.out.println("3. Sum of all numbers up to n");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Factorial of " + n + " is: " + calculator.factorial(n));
                    break;
                case 2:
                    System.out.println("Fibonacci number at position " + n + " is: " + calculator.fibonacci(n));
                    break;
                case 3:
                    System.out.println("Sum of all numbers up to " + n + " is: " + calculator.sumofAllNumbers(n));
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }
        scanner.close();
    }
}
     
    

