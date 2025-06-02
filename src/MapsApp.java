/**
 * Represents the Maps application on the iPhone.
 * Provides mapping, navigation, and location search functionalities.
 */
public class MapsApp extends Application {
    @Override
    public void access() {
        System.out.println("MapsApp: Accessed the Maps application.");
    }

    /**
     * Displays the map view.
     */
    public void displayMap() {
        System.out.println("MapsApp: Displaying map.");
    }

    /**
     * Displays the satellite view of the map.
     */
    public void displaySatelliteView() {
        System.out.println("MapsApp: Displaying satellite view.");
    }

    /**
     * Gets directions from an origin to a destination.
     * @param origin The starting point.
     * @param destination The ending point.
     */
    public void getDirections(String origin, String destination) {
        System.out.println("MapsApp: Getting directions from " + origin + " to " + destination);
    }

    /**
     * Views real-time traffic information on the map.
     */
    public void viewTrafficInfo() {
        System.out.println("MapsApp: Viewing traffic information.");
    }

    /**
     * Searches for a specific location or business.
     * @param query The search query.
     */
    public void searchLocation(String query) {
        System.out.println("MapsApp: Searching for location: " + query);
    }

    /**
     * Initiates a call to a business found on the map.
     * @param businessId The identifier of the business.
     */
    public void callBusiness(String businessId) {
        System.out.println("MapsApp: Calling business: " + businessId);
        // This would typically interface with the PhoneApp
    }

    /**
     * Adjusts the zoom level of the map using a gesture.
     * @param gesture The type of zoom gesture.
     */
    public void zoomMap(String gesture) {
        System.out.println("MapsApp: Zooming map with gesture: " + gesture);
    }
}

