/**
 * Represents a contact entry with personal details.
 */
public class Contact {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String physicalAddress;

    /**
     * Constructor for the Contact class.
     * @param name The name of the contact.
     * @param phoneNumber The phone number of the contact.
     * @param emailAddress The email address of the contact.
     * @param physicalAddress The physical address of the contact.
     */
    public Contact(String name, String phoneNumber, String emailAddress, String physicalAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;
        System.out.println("Contact: Created new contact: " + name);
    }

    // Getters for attributes
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Returns a string containing all details of the contact.
     * @return A formatted string with contact details.
     */
    public String getDetails() {
        return "Contact Details:\n" +
                "  Name: " + name + "\n" +
                "  Phone: " + phoneNumber + "\n" +
                "  Email: " + emailAddress + "\n" +
                "  Address: " + physicalAddress;
    }
}
