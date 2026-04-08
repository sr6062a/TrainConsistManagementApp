import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println(" UC11 - Validate Train ID & Cargo Code ");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        System.out.println("Train ID: " + trainId + " -> " +
                (isTrainValid ? "VALID" : "INVALID"));

        System.out.println("Cargo Code: " + cargoCode + " -> " +
                (isCargoValid ? "VALID" : "INVALID"));
    }
}