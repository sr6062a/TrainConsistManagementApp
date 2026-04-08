public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println(" UC18 - Linear Search for Bogie ID ");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchId = "BG309";

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // early termination
            }
        }

        if (found) {
            System.out.println("\n\nBogie ID " + searchId + " FOUND in the train.");
        } else {
            System.out.println("\n\nBogie ID " + searchId + " NOT FOUND.");
        }
    }
}