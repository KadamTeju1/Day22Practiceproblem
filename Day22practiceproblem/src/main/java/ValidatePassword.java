import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a valid password (minimum 8 characters, at least 1 uppercase letter, at least 1 numeric digit, and exactly 1 special character): ");
            String password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Valid password: " + password);
                break;
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        // Check if the password has a minimum of 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Check if the password contains at least 1 uppercase letter
        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }

        // Check if the password contains at least 1 numeric digit
        boolean hasNumeric = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumeric = true;
                break;
            }
        }

        // Check if the password contains exactly 1 special character
        boolean hasSpecialChar = false;
        String specialCharacters = "!@#$%^&*()-_=+[{]}|;:',<.>?";
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                hasSpecialChar = true;
                break;
            }
        }

        return hasUppercase && hasNumeric && hasSpecialChar;
    }
}