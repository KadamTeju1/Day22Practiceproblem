import java.util.ArrayList;
import java.util.List;

public class ClearEmailSamples {
    public static void main(String[] args) {
        // List of email samples
        List<String> emailSamples = new ArrayList<>();

        // Add email samples to the list
        emailSamples.add("sample1@example.com");
        emailSamples.add("sample2@gmail.com");
        emailSamples.add("sample3@yahoo.com");

        // Clear all email samples
        clearEmails(emailSamples);

        // Print the cleared email samples
        System.out.println("Cleared email samples:");
        for (String email : emailSamples) {
            System.out.println(email);
        }
    }

    public static void clearEmails(List<String> emails) {
        for (int i = 0; i < emails.size(); i++) {
            emails.set(i, "");
        }
    }
}