import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class StatisticsCalculatorTest{
	
	@Test
	public void testThatIHaveAnArrayOfNumbersTheLargestIsTheLargestInTheArray(){

	//Given
	int [] numbers = {3, 5, 7,1, 25, 11, 0};

	//When
	int expectedRange = StatisticsCalculator.calculateRangeOf(numbers);

	int largest = StatisticsCalculator.findLargestNumberIn(numbers);
	int actualRange = 25;

	//Check
	assertEquals(actualRange, expectedRange);


	}
	
    @Test
    public void testThatTheMeanIsCorrect() {
    
    //Given
    int[] numbers = {3, 5, 7, 1, 25, 11, 0};

    //When
    int actualMean = StatisticsCalculator.calculateMeanOf(numbers);

    int Mean = StatisticsCalculator.calculateMeanOf(numbers);
    int expectedMean = 7;

    //Check
    assertEquals(actualMean, expectedMean);


    }

    @Test
    public void testThatTheMedianIsCorrect() {
    
    //Given
    int[] numbers = {3, 5, 7, 1, 25, 11, 0};

    //When
    int actualMedian = StatisticsCalculator.calculateMedianOf(numbers);

    int Median = StatisticsCalculator.calculateMedianOf(numbers);
    int expectedMedian = 5;

    //Check
    assertEquals(expectedMedian, actualMedian);


    }



    @Test
    public void testThatTheModeIsCorrect() {
    
    //Given
    int[] numbers = {3, 5, 7, 1, 5, 11, 5};

    //When
    int actualMode = StatisticsCalculator.calculateModeOf(numbers);

    int Mode = StatisticsCalculator.calculateModeOf(numbers);
    int expectedMode = 5;

    //Check
    assertEquals(actualMode, expectedMode);


    }




    @Test
    public void testThatTheDeviationIsCorrect() {
    
    //Given
    int[] numbers = {3, 5, 7, 1, 25, 11, 0};

    //When
    int[] actualDeviation = StatisticsCalculator.calculateDeviationOf(numbers);

    int[] expectedDeviation = {-4, -2, 0, -6, 18, 4, -7};

    //Check
    assertArrayEquals(expectedDeviation, actualDeviation);

    }


    @Test
    public void testThatTheMeanDeviationIsCorrect() {
    
    //Given
    int[] numbers = {3, 5, 7, 1, 25, 11, 0};

    //When
    double actualMeanDeviation = StatisticsCalculator.calculateMeanDeviationOf(numbers);

    double MeanDeviation = StatisticsCalculator.calculateMeanDeviationOf(numbers);
    double expectedMeanDeviation = 0.4285714285714288;

    //Check
    assertEquals(expectedMeanDeviation, actualMeanDeviation);


    }




    @Test
    public void testThatTheVarianceIsCorrect() {
    
    //Given
    int[] numbers = {3, 5, 7, 1, 25, 11, 0};

    //When
    double actualVariance = StatisticsCalculator.calculateVarianceOf(numbers);

    double Variance = StatisticsCalculator.calculateVarianceOf(numbers);
    double expectedVariance = 63.57142857142857;

    //Check
    assertEquals(expectedVariance, actualVariance);


    }



    @Test
    public void testThatTheStandardDeviationIsCorrect() {
    
    //Given
    int[] numbers = {3, 5, 7, 1, 25, 11, 0};

    //When
    double actualStandardDeviation = StatisticsCalculator.calculateStandardDeviationeOf(numbers);

    double StandardDeviation = StatisticsCalculator.calculateStandardDeviationeOf(numbers);
    double expectedStandardDeviation = 7.9699999999998745;

    //Check
    assertEquals(expectedStandardDeviation, actualStandardDeviation);


    }



    @Test
    public void testThatTheCoeffientOfVarianceIsCorrect() {
    
    //Given
    int[] numbers = {3, 5, 7, 1, 25, 11, 0};

    //When
    double actualCoeffientOfVariance = StatisticsCalculator.calculateCoeffientOfVarianceOf(numbers);

    double CoeffientOfVariance = StatisticsCalculator.calculateCoeffientOfVarianceOf(numbers);
    double expectedCoeffientOfVariance = 107.28846153845986;

    //Check
    assertEquals(expectedCoeffientOfVariance, actualCoeffientOfVariance);


    }




}








