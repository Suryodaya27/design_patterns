public class Main {
    public static void main(String[] args) {
        // Get the only object available
        Counter counter1 = Counter.getInstance();
        Counter counter2 = Counter.getInstance();

        // Increment the count using one instance
        counter1.increment();
        counter1.increment();

        // Increment the count using the other instance
        counter2.increment();

        // Since both instances are the same, the count should be 3
        System.out.println("Count: " + counter1.getCount());
        System.out.println("Count: " + counter2.getCount());
    }
}
