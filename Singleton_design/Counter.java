public class Counter {
    // Private static variable of the same class that is the only instance of the class.
    private static Counter instance;
    private int count;

    // Private constructor to restrict instantiation of the class from other classes.
    private Counter() {
        count = 0;
    }

    // Public static method that returns the instance of the class, creating it if necessary.
    public static synchronized Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    // Method to increment the count
    public void increment() {
        count++;
    }

    // Method to get the current count
    public int getCount() {
        return count;
    }
}
