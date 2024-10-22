import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string (a): ");
        String a = scanner.nextLine();
        System.out.print("Enter second string (b): ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
}

