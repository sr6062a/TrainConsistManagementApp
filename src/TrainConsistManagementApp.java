public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println(" UC20 - Exception Handling During Search ");

        String[] bogieIds = {};

        String searchId = "BG101";

        try {
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available for search!");
            }

            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie ID " + searchId + " FOUND.");
            } else {
                System.out.println("Bogie ID " + searchId + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}