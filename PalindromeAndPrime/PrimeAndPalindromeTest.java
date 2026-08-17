import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeAndPalindromeTest {
    

    @Test
    public void thatThatThePalindromeIsGivingMeCorrectOutput() {

    //Given
    int numbers = 12321;
    
    //When
    boolean actualPalindrome = PrimeAndPalindrome.primeAndPalindromeOf(numbers);
    boolean expectedPalindrome = true;

    //Check
    assertEquals(expectedPalindrome, actualPalindrome);

    }



}

