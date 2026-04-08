import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Display section header
        System.out.println("UC2 - Add Passenger Bogies to Train");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing \"AC Chair\":");
        System.out.println("Passenger Bogies: " + passengerBogies);

        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists);

        System.out.println("\nFinal Train Passenger Consist: " + passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}