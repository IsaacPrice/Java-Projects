import java.util.Scanner;

public class Calculator {
    // This is the main class
    public static void main(String[] args) {
        // Create a scanner object to get the two numbers
        Scanner scanner = new Scanner(System.in);

        // Get the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Get the second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Print out all the calculations
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        
        // Makes sure that the number isn't 0
        if (secondNumber == 0) {
            System.out.println("Cannot divide by 0.");
        }
        else {
            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        }

        // Close the scanner
        scanner.close();
    }
}
