import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class StrictlyIdenticalArraysTest {
	
	@Test
	public void testThatTheArraysAreStrictlyIdentical(){

	//Given
    int[] list1 = {5, 2, 5, 6, 1, 6};

    int[] list2 = {5, 2, 5, 6, 1, 6};

	//When
	boolean expectedResult = StrictlyIdenticalArrays.strictlyIdenticalArraysOf(list1, list2);

	boolean actualResult = true;

	//Check
	assertEquals(actualResult, expectedResult);


	}



	@Test
	public void testThatTheArraysAreStrictlyIdentical2(){

	//Given
    int[] list1 = {5, 2, 5, 6, 1, 6};

    int[] list2 = {5, 2, 5, 6, 1, 6, 7};

	//When
	boolean expectedResult = StrictlyIdenticalArrays.strictlyIdenticalArraysOf(list1, list2);

	boolean actualResult = false;

	//Check
	assertEquals(actualResult, expectedResult);


	}



	@Test
	public void testThatTheArraysAreStrictlyIdentical3(){

	//Given
    int[] list1 = {5, 2, 5, 6, 1, 6};

    int[] list2 = {5, 2, 5, 8, 1, 6};

	//When
	boolean expectedResult = StrictlyIdenticalArrays.strictlyIdenticalArraysOf(list1, list2);

	boolean actualResult = false;

	//Check
	assertEquals(actualResult, expectedResult);


	}




	@Test
	public void testThatTheArraysAreStrictlyIdentical4(){

	//Given
    int[] list1 = {5, 2, 5, 6, 1, 6};

    int[] list2 = {5, 2, 56, 87, 1, 6};

	//When
	boolean expectedResult = StrictlyIdenticalArrays.strictlyIdenticalArraysOf(list1, list2);

	boolean actualResult = false;

	//Check
	assertEquals(actualResult, expectedResult);


	}



	@Test
	public void testThatTheArraysAreStrictlyIdentical5(){

	//Given
    int[] list1 = {5, 2, 5, 6, 1, 6};

    int[] list2 = {5, 2, 5, 8, 1, 6, 0};

	//When
	boolean expectedResult = StrictlyIdenticalArrays.strictlyIdenticalArraysOf(list1, list2);

	boolean actualResult = false;

	//Check
	assertEquals(actualResult, expectedResult);


	}



	@Test
	public void testThatTheArraysAreStrictlyIdentical6(){

	//Given
    int[] list1 = {5, 2, 0, 6, 1, 6};

    int[] list2 = {5, 2, 0, 6, 1, 6};

	//When
	boolean expectedResult = StrictlyIdenticalArrays.strictlyIdenticalArraysOf(list1, list2);

	boolean actualResult = true;

	//Check
	assertEquals(actualResult, expectedResult);


	}





	@Test
	public void testThatItIsAConsecutiveOf(){

	//Given
    int numbers = 8;
    int[] values = {3, 4, 5, 5, 5, 5, 4, 5};   
//    int[] values = {3, 4, 5, 5, 6, 5, 5, 4, 5}; 

	//When
	boolean actualValue = StrictlyIdenticalArrays.isConsecutiveFour(values);

	boolean expectedValue = true;

	//Check
	assertEquals(expectedValue, actualValue);


	}










}





