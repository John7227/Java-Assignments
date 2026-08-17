import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModeTest {

    @Test
    public void testThatThisModeIsWorkingPerfectly(){

    //Given
    int[] numbers = {3, 7, 8, 7, 8, 3, 7 , 8};

    //When
    int actualMode = Mode.modeOf(numbers);
    int expectedMode = 7;

    //Check
    assertEquals(expectedMode, actualMode);

    }


    @Test
    public void testIfThisIsAConsecutiveOfFour(){

    //Given
    int[] numbers = {3, 4, 5, 5, 5, 5, 4, 5};

    //When
    boolean actualNumbers = Mode.isConsecutiveFour(numbers);
    boolean expectedNumbers = true;
    
    assertEquals(expectedNumbers, actualNumbers);


    }


    @Test
    public void testIfThisIsAConsecutiveOfFour2(){

    //Given
    int[] numbers = {3, 4, 5, 5, 6, 5, 5, 4, 5}; 


    //When
    boolean actualNumbers = Mode.isConsecutiveFour(numbers);
    boolean expectedNumbers = false;
    
    assertEquals(expectedNumbers, actualNumbers);


    }


//    @Test
//    public void mergeTwoSortedListAndBeSureTheyAreCorrect() {
//
//    //Given
//    int[] list1 = {5, 1, 5, 16, 61, 111};
//
//    int[] list2 = {4, 2, 4, 5, 6};
//
//    //When
//    int[] actualSort = Mode.sortingOfTheTwoLists(list1, list2);
//
//    int[] expectedSort = {5, 1, 16, 61, 111, 4, 2, 5, 6};
//
//
//    //Check
//    assertArrayEquals(expectedSort, actualSort);
//    }


//
//    @Test
//    public void testThatTheNumberOfDistinctNumbersAreCorrect() {
//
//    //Given
//    int[] numbers = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
//
//    //When
//    int[] actualDistinct = Mode.distinctNumbers(numbers);
//    
//    int[] expectedDistinct = {1, 2, 3, 6, 4, 5};
//
//    //Check
//    assertArrayEquals(expectedDistinct, actualDistinct);
//
//    }
//
//
//











































}
