import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // Bogie class (same as UC7)
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
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("=================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("All Bogies:");
        System.out.println(bogies);

        // Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (capacity > 60):");
        System.out.println(filteredBogies);

        System.out.println("\nUC8 operations completed successfully...");
    }
}