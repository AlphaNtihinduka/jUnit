import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsTest {

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
}
