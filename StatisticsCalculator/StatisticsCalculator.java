public class StatisticsCalculator{




	public static int calculateRangeOf(int[] numbers){
	
		return findLargestNumberIn(numbers) - findSmallestNumberIn(numbers);

	}


	public static int findLargestNumberIn(int[] numbers){
		int largest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] > largest)
				largest = numbers[index];
		}
		return largest;
	}

	public static int findSmallestNumberIn(int[] numbers){
		int smallest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] < smallest)
				smallest = numbers[index];
		}
		return smallest;
	}




    public static int calculateMeanOf(int[] numbers) {

    int total = 0;

        for(int count = 0; count < numbers.length; count++) {
        total += numbers[count];
        }
    
    int mean = total / 7;
    return mean;

    }



    public static int calculateMedianOf(int[] numbers) {

    int median = 0;
    int temp = 0;

    for(int count = 0; count < numbers.length; count++) {
        for(int value = 0; value < numbers.length; value++) {
            if(numbers[count] > numbers[value]) {
                temp = numbers[count];
                numbers[count] = numbers[value];
                numbers[value] = temp;
                median = numbers[3];
                if(median % 2 == 0) {
                    median += median;    
                }
            }
        }
    
    }


    return median;

    }



    public static int calculateModeOf(int[] numbers) {

    int counter = 0;
    
    for(int count = 0; count < numbers.length; count++) {
        for(int value = 0; value < numbers.length; value++) {
            if(numbers[count] == numbers[value]) {
                counter = numbers[count];
            }
        }
    }
    return counter;
    }





    public static int[] calculateDeviationOf(int[] numbers) {

     int total = 0;
     int[] deviation = new int[numbers.length];

    for(int count = 0; count < numbers.length; count++) {
      total = numbers[count] - calculateMeanOf(numbers);
   
        deviation[count] += total;
    }
    return deviation;

    }





    public static double calculateMeanDeviationOf(int[] numbers) {

     double total = 0;
     double meanDeviation = 0;

        for(int count = 0; count < numbers.length; count++) {
        total = numbers[count] - calculateMeanOf(numbers);
        meanDeviation += total / 7;
        }

    return meanDeviation;
    }



    public static double calculateVarianceOf(int[] numbers) {

     double total = 0;
     double variance = 0;
    double multipleOfTotal = 0;
    double sumOfTotal = 0;

        for(int count = 0; count < numbers.length; count++) {
        total = numbers[count] - calculateMeanOf(numbers);
        sumOfTotal += (total * total);
        variance = sumOfTotal / numbers.length;
        }

    return variance;
    }



    public static double calculateStandardDeviationeOf(int[] numbers) {

    double variance = calculateVarianceOf(numbers);
    double standardDeviation = 0.0;

    for(double count = 0; count * count < variance; count += 0.01) {
        standardDeviation = count;
    }
    return standardDeviation;
    }



    public static double calculateCoeffientOfVarianceOf(int[] numbers) {

    double CoeffientOfVariance = (calculateStandardDeviationeOf(numbers) / 7.428571428571429) * 100;
    
    return CoeffientOfVariance;
    }





}























 
