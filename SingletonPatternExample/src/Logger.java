public class Logger {

    // This holds the single instance of the Logger
    private static Logger instance;

    // Private constructor to stop other classes from creating a new Logger
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Provides access to the only Logger instance (creates it if it doesn't exist)
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // A simple method to print log messages
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
