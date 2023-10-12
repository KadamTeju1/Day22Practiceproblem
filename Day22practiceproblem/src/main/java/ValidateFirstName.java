import java.util.Scanner;

public class ValidateLastName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a valid last name: ");
            String lastName = scanner.nextLine();

            if (isValidLastName(lastName)) {
                System.out.println("Valid last name: " + lastName);
                break;
            } else {
                System.out.println("Invalid last name. Please try again.");
            }
        }

        scanner.close();
    }

    public static boolean isValidLastName(String lastName) {
        // Check if the last name starts with a capital letter
        if (!Character.isUpperCase(lastName.charAt(0))) {
            return false;
        }

        // Check if the last name has a minimum of 3 characters
        if (lastName.length() < 3) {
            return false;
        }

        return true;
    }
}