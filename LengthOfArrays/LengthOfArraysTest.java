import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LengthOfArraysTest{
	
	@Test
	public void testThatTheLengthIsCorrect(){

	//Given
    String [] words = {"Lawrence"};

	//When
	int expectedWords = LengthOfArrays.lengthOfArrays(words);

	int actualWords = 8;

	//Check
	assertEquals(expectedWords, actualWords);


	}

}


