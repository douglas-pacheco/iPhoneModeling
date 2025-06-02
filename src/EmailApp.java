/**
 * Represents the Email application on the iPhone.
 * Handles email retrieval, display, and interaction.
 */
public class EmailApp extends Application {
    @Override
    public void access() {
        System.out.println("EmailApp: Accessed the Email application.");
    }

    /**
     * Retrieves new emails from configured accounts.
     */
    public void retrieveEmails() {
        System.out.println("EmailApp: Retrieving emails...");
    }

    /**
     * Displays the content of a specific email.
     * @param emailId The identifier of the email to display.
     */
    public void displayEmail(String emailId) {
        System.out.println("EmailApp: Displaying email: " + emailId);
    }

    /**
     * Detects phone numbers within an email's content.
     * @param emailContent The content of the email to scan.
     */
    public void detectPhoneNumber(String emailContent) {
        System.out.println("EmailApp: Detecting phone numbers in email content.");
        // In a real app, this would parse the content and return numbers
    }

    /**
     * Initiates a call directly from a detected phone number in an email.
     * @param phoneNumber The phone number to call.
     */
    public void callFromEmail(String phoneNumber) {
        System.out.println("EmailApp: Calling " + phoneNumber + " from email.");
        // This would typically interface with the PhoneApp
    }
}

