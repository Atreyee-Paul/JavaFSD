public class Test {
    public static void main(String[] args) {
        // Request the Logger instance for the first time
        Logger logger1 = Logger.getInstance();

        // Request the Logger instance again
        Logger logger2 = Logger.getInstance();

        // Log some messages using both references
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Check if both logger1 and logger2 point to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton confirmed).");
        } else {
            System.out.println("Different logger instances (Singleton failed).");
        }
    }
}
