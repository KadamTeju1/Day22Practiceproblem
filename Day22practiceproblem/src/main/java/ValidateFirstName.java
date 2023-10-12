import java.util.Scanner;

public class ValidateFirstName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a valid first name: ");
            String firstName = scanner.nextLine();

            if (isValidFirstName(firstName)) {
                System.out.println("Valid first name: " + firstName);
                break;
            } else {
                System.out.println("Invalid first name. Please try again.");
            }
        }
        scanner.close();
    }

    public static boolean isValidFirstName(String firstName) {
        // Check if the first name starts with a capital letter
        if (!Character.isUpperCase(firstName.charAt(0))) {
            return false;
        }

        // Check if the first name has a minimum of 3 characters
        if (firstName.length() < 3) {
            return false;
        }
        return true;
    }
}