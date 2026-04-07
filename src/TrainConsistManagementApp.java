import java.util.*;

public class TrainConsistManagementApp {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("=================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 24));

        // Before sorting
        System.out.println("Before Sorting:");
        System.out.println(bogies);

        // Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // After sorting
        System.out.println("\nAfter Sorting by Capacity:");
        System.out.println(bogies);

        System.out.println("\nUC7 operations completed successfully...");
    }
}