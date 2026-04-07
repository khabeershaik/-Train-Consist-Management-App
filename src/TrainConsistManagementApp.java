import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=================================\n");

        // Create HashSet (stores unique values)
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");

        // Duplicate entries (will be ignored)
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nUC3 operations completed successfully...");
    }
}