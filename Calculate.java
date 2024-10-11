import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu (add a power operation)
        System.out.println("Welcome to the Command-Line Calculator");
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        // Read the user's choice
        System.out.print("Enter the number of the operation you want to perform: ");
        int choice = scanner.nextInt();

        // Read two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the chosen operation (fix a bug)
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
                break;
            default:
                System.out.println("Error: Invalid choice. Please select a valid operation.");
        }

        // Close the scanner
        scanner.close();
    }
}
