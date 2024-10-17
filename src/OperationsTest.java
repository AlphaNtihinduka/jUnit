import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsTest {

    // Testing for the Subtraction operation with positive and negative values
    @Test
    public void testsubtractionPositive() {
        System.out.println("Subtracting positive values");
        int result = Operations.subtraction(5,10);
        assertEquals(5, result);
    }

    @Test
    public void testSubtractionNegative() {
        System.out.println("Subtracting negative Values");
        int result = Operations.subtraction(-4, -7);
        assertEquals(-3, result);
    }

    // Testing for the multiplation operation with positive and negative values
    @Test
    public void testmultiplicationPositive() {
        System.out.println("Subtracting positive values");
        int result = Operations.multiplication(5,10);
        assertEquals(50, result);
    }

    @Test
    public void testmultiplicationNegative() {
        System.out.println("Multiplying negative Values");
        int result = Operations.multiplication(-4, -3);
        assertEquals(12, result);
    }
}
