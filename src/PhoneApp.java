import java.util.ArrayList;
import java.util.List;

/**
 * Represents the Phone application on the iPhone.
 * Handles call management, contacts, and voicemail.
 */
public class PhoneApp extends Application {
    // Aggregation: PhoneApp "has-a" relationship with Contact objects.
    // Contacts can exist independently of the PhoneApp.
    private List<Contact> contacts;
    private List<String> callRecents;
    private List<String> voicemails; // Simplified for demonstration

    /**
     * Constructor for PhoneApp.
     * Initializes the contacts list.
     */
    public PhoneApp() {
        this.contacts = new ArrayList<>();
        this.callRecents = new ArrayList<>();
        this.voicemails = new ArrayList<>();
        System.out.println("PhoneApp: Initialized.");
    }

    @Override
    public void access() {
        System.out.println("PhoneApp: Accessed the Phone application.");
    }

    /**
     * Dials a specific phone number.
     * @param number The phone number to dial.
     */
    public void dialNumber(String number) {
        System.out.println("PhoneApp: Dialing " + number + "...");
        callRecents.add("Outgoing: " + number);
    }

    /**
     * Calls a contact from the contacts list.
     * @param contact The Contact object to call.
     */
    public void callContact(Contact contact) {
        System.out.println("PhoneApp: Calling " + contact.getName() + " at " + contact.getPhoneNumber() + "...");
        callRecents.add("Outgoing: " + contact.getName());
    }

    /**
     * Manages an ongoing call (e.g., hold, merge, speaker).
     * @param action The action to perform on the call.
     */
    public void manageCall(String action) {
        System.out.println("PhoneApp: Managing call: " + action);
    }

    /**
     * Views recent calls.
     */
    public void viewRecents() {
        System.out.println("PhoneApp: Viewing recent calls: " + callRecents);
    }

    /**
     * Views favorite contacts.
     */
    public void viewFavorites() {
        System.out.println("PhoneApp: Viewing favorite contacts.");
        // In a real app, you'd filter contacts by a 'favorite' flag
    }

    /**
     * Adds a contact to favorites.
     * @param contact The Contact object to add to favorites.
     */
    public void addFavorite(Contact contact) {
        System.out.println("PhoneApp: Added " + contact.getName() + " to favorites.");
        // In a real app, you'd mark the contact as favorite
    }

    /**
     * Removes a contact from favorites.
     * @param contact The Contact object to remove from favorites.
     */
    public void removeFavorite(Contact contact) {
        System.out.println("PhoneApp: Removed " + contact.getName() + " from favorites.");
        // In a real app, you'd unmark the contact as favorite
    }

    /**
     * Edits the order of favorite contacts.
     */
    public void editFavoriteOrder() {
        System.out.println("PhoneApp: Editing favorite order.");
    }

    /**
     * Accesses the phone keypad.
     */
    public void accessKeypad() {
        System.out.println("PhoneApp: Accessed keypad.");
    }

    /**
     * Accesses the voicemail system.
     */
    public void accessVoicemail() {
        System.out.println("PhoneApp: Accessed voicemail. Available voicemails: " + voicemails.size());
    }

    /**
     * Listens to a specific voicemail message.
     * @param messageId The identifier of the voicemail message.
     */
    public void listenToVoicemail(String messageId) {
        System.out.println("PhoneApp: Listening to voicemail: " + messageId);
    }

    /**
     * Returns a call directly from a voicemail message.
     * @param messageId The identifier of the voicemail message to return call from.
     */
    public void returnCallFromVoicemail(String messageId) {
        System.out.println("PhoneApp: Returning call from voicemail: " + messageId);
    }

    /**
     * Adds a contact to the PhoneApp's internal list (for demonstration).
     * @param contact The contact to add.
     */
    public void addContact(Contact contact) {
        this.contacts.add(contact);
        System.out.println("PhoneApp: Contact added: " + contact.getName());
    }
}
