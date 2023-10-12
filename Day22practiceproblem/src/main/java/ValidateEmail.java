import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a valid email: ");
            String email = scanner.nextLine();

            if (isValidEmail(email)) {
                System.out.println("Valid email: " + email);
                break;
            } else {
                System.out.println("Invalid email. Please try again.");
            }
        }

        scanner.close();
    }

    public static boolean isValidEmail(String email) {
        // Define a regular expression pattern for a valid email
        String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z]+(\\.[a-zA-Z]{2,})*(\\.[a-zA-Z]{2,})$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the email against the pattern
        Matcher matcher = pattern.matcher(email);

        // Return true if the email matches the pattern, indicating it's valid
        return matcher.matches();
    }
}