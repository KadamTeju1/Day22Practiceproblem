public class UserEntryValidation {
    public static boolean isValidFirstName(String firstName) {
        return firstName != null && firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    public static boolean isValidLastName(String lastName) {
        return lastName != null && lastName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z]+(\\.[a-zA-Z]{2,})*(\\.[a-zA-Z]{2,})$");
    }

    public static boolean isValidMobile(String mobile) {
        return mobile != null && mobile.matches("^\\d{2} \\d{10}$");
    }

    public static boolean isValidPassword(String password) {
        return password != null && password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&*()-_=+[{]}|;:',<.>?]).{8,}$");
    }
}