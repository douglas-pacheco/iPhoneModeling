/**
 * Represents the Widgets application on the iPhone.
 * Displays quick information like stock prices and weather.
 */
public class WidgetsApp extends Application {
    @Override
    public void access() {
        System.out.println("WidgetsApp: Accessed the Widgets application.");
    }

    /**
     * Views stock market information.
     */
    public void viewStockInfo() {
        System.out.println("WidgetsApp: Viewing stock information.");
    }

    /**
     * Views local weather information.
     */
    public void viewWeatherInfo() {
        System.out.println("WidgetsApp: Viewing weather information.");
    }
}