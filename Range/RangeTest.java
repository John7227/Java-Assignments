import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {

    @Test
    public void testThatWhenISubtractTheLargestFromTheSmallestIWillGetTheRange(){

    //Given
    int [] numbers = {2, 5, 1, 9, 7};
    
    //When
    int expectedRange = Range.rangeOf(numbers);

    int largest = Range.largest(numbers);
    int actualRange = 8;

    //Check
    assertEquals(actualRange, expectedRange);   

    }


    @Test
    public void testThatWhenISubtractTheLargestFromTheSmallestIWillGetTheRange2(){

    //Given
    int [] numbers = {8, 1, 5, 10, 16};
    
    //When
    int expectedRange = Range.rangeOf(numbers);

    int largest = Range.largest(numbers);
    int actualRange = 15;

    //Check
    assertEquals(actualRange, expectedRange);   

    }


    @Test
    public void testThatWhenISubtractTheLargestFromTheSmallestIWillGetTheRange3(){

    //Given
    int [] numbers = {8, 6, 5, 11, 26};
    
    //When
    int expectedRange = Range.rangeOf(numbers);

    int largest = Range.largest(numbers);
    int actualRange = 21;

    //Check
    assertEquals(actualRange, expectedRange);   

    }

    @Test
    public void testThatWhenISubtractTheLargestFromTheSmallestIWillGetTheRange4(){

    //Given
    int [] numbers = {-2, -1, 5, 10, 7};
    
    //When
    int expectedRange = Range.rangeOf(numbers);

    int largest = Range.largest(numbers);
    int actualRange = 5;

    //Check
    assertEquals(actualRange, expectedRange);   

    }


}



