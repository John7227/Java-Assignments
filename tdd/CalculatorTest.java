import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {

        Calculator calc = new Calculator();

        int result = calc.add(3,4);

        assertEquals(7,result);

    }

    @Test
    public void testSubtraction() {

    Calculator calc = new Calculator();

    int result = calc.subtract(9,4);

    assertEquals(5, result);

    }

}
