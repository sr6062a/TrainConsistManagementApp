import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println(" UC13 - Safety Compliance Check ");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        System.out.println("Goods Bogies:");
        goodsBogies.forEach(System.out::println);

        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        System.out.println("\nSafety Status: " +
                (isSafe ? "SAFE TRAIN" : "UNSAFE TRAIN"));
    }
}