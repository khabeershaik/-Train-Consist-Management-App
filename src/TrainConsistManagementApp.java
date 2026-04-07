import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("=================================\n");

        // Create HashMap (Bogie -> Capacity)
        Map<String, Integer> capacityMap = new HashMap<>();

        // Add bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 50);
        capacityMap.put("First Class", 24);

        // Display bogie capacities
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 operations completed successfully...");
    }
}