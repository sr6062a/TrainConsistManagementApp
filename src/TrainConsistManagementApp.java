public class TrainConsistManagementApp {

    // 🔹 Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // 🔹 Goods Bogie model
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {

            try {
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned: " + shape + " -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Validation completed for: " + shape + "\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(" UC15 - Safe Cargo Assignment ");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");

        b2.assignCargo("Petroleum");

        b2.assignCargo("Coal");
    }
}