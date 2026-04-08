import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

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

            } catch (CargoSafetyException e) {
                // handled
            } finally {
                // always executes
            }
        }
    }

    @Test
    void testCargo_SafeAssignment() {
        GoodsBogie b = new GoodsBogie("Cylindrical");
        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        GoodsBogie b = new GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.cargo);
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        GoodsBogie b = new GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.cargo);
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        GoodsBogie b = new GoodsBogie("Rectangular");

        b.assignCargo("Petroleum");
        b.assignCargo("Coal");

        assertEquals("Coal", b.cargo);
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        GoodsBogie b = new GoodsBogie("Cylindrical");

        assertDoesNotThrow(() -> b.assignCargo("Petroleum"));
    }
}