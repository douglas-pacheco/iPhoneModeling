/**
 * Represents the SMS (Messages) application on the iPhone.
 * Handles sending and receiving text messages.
 */
public class SMSApp extends Application {
    @Override
    public void access() {
        System.out.println("SMSApp: Accessed the Messages application.");
    }

    /**
     * Composes and sends an SMS message.
     * @param recipient The recipient of the message.
     * @param message The content of the message.
     */
    public void composeSMS(String recipient, String message) {
        System.out.println("SMSApp: Composing message to " + recipient + ": '" + message + "'");
        System.out.println("SMSApp: Message sent.");
    }

    /**
     * Views ongoing message conversations.
     */
    public void viewConversations() {
        System.out.println("SMSApp: Viewing conversations.");
    }

    /**
     * Simulates receiving a new message notification.
     */
    public void receiveNotification() {
        System.out.println("SMSApp: New message notification received!");
    }
}
