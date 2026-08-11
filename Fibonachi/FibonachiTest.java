import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FibonachiTest{

    @Test
    public void testThatTheFibonachiIsCorrect() {
    
    //Given
    int numbers = 10;

    //When
    int actualFibonachi = Fibonachi.fibonachi(numbers);

    int Fibonachi = Fibonachi.fibonachi(numbers);
    int[] expectedFibonachi = {0, 1 , 1 , 2, 3, 5, 8, 13, 21, 34};

    //Check
    assertEquals(expectedFibonachi, actualFibonachi);


    }

}
