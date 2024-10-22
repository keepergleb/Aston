import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter first integer (a): ");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Error: entered value is not integer.");
                scanner.next();
            }
        }

        validInput = false;

        while (!validInput) {
            System.out.print("Enter second integer (b): ");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Error: entered value is not integer.");
                scanner.next();
            }
        }


        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }


        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (b != 0) ? (double) a / b : Double.POSITIVE_INFINITY;


        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiple: " + product);
        System.out.println("Division: " + quotient);
    }
}