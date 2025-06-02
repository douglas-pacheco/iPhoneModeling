/**
 * Represents the main iPhone device, managing core functionalities and applications.
 */
public class iPhone {
    // Composition: iPhone "has-a" relationship with its applications.
    // These applications are typically instantiated when the iPhone is created.
    private MusicApp musicApp;
    private PhoneApp phoneApp;
    private SMSApp smsApp;
    private PhotoApp photoApp;
    private EmailApp emailApp;
    private SafariBrowserApp safariBrowserApp;
    private MapsApp mapsApp;
    private WidgetsApp widgetsApp;

    /**
     * Constructor for the iPhone class.
     * Initializes all the built-in applications.
     */
    public iPhone() {
        this.musicApp = new MusicApp();
        this.phoneApp = new PhoneApp();
        this.smsApp = new SMSApp();
        this.photoApp = new PhotoApp();
        this.emailApp = new EmailApp();
        this.safariBrowserApp = new SafariBrowserApp();
        this.mapsApp = new MapsApp();
        this.widgetsApp = new WidgetsApp();
        System.out.println("iPhone device initialized with all applications.");
    }

    /**
     * Unlocks the iPhone device.
     */
    public void unlock() {
        System.out.println("iPhone: Device unlocked.");
    }

    /**
     * Returns the user to the home screen.
     */
    public void returnToHomeScreen() {
        System.out.println("iPhone: Returned to home screen.");
    }

    /**
     * Rotates the device's orientation (e.g., portrait to landscape).
     */
    public void rotateOrientation() {
        System.out.println("iPhone: Orientation rotated.");
    }

    /**
     * Connects the iPhone to a network (e.g., Wi-Fi, cellular data).
     */
    public void connectToNetwork() {
        System.out.println("iPhone: Connected to network.");
    }

    // Getters for applications (optional, but useful for interaction)
    public MusicApp getMusicApp() {
        return musicApp;
    }

    public PhoneApp getPhoneApp() {
        return phoneApp;
    }

    public SMSApp getSmsApp() {
        return smsApp;
    }

    public PhotoApp getPhotoApp() {
        return photoApp;
    }

    public EmailApp getEmailApp() {
        return emailApp;
    }

    public SafariBrowserApp getSafariBrowserApp() {
        return safariBrowserApp;
    }

    public MapsApp getMapsApp() {
        return mapsApp;
    }

    public WidgetsApp getWidgetsApp() {
        return widgetsApp;
    }
}