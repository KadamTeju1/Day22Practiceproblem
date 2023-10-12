import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a valid phone number (e.g., 91 9919819801): ");
            String phoneNumber = scanner.nextLine();

            if (isValidPhoneNumber(phoneNumber)) {
                System.out.println("Valid phone number: " + phoneNumber);
                break;
            } else {
                System.out.println("Invalid phone number. Please try again.");
            }
        }

        scanner.close();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Define a regular expression pattern for a valid phone number
        String regex = "^\\d{2} \\d{10}$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the phone number against the pattern
        Matcher matcher = pattern.matcher(phoneNumber);

        // Return true if the phone number matches the pattern, indicating it's valid
        return matcher.matches();
    }
}