public class Range {

    public static int rangeOf(int[] numbers) {

    return largest(numbers) - smallest(numbers);

    }


    public static int largest(int[] numbers) {

    int largest = numbers[0];
        for(int count = 0; count < numbers.length; count++) {
            if(largest < numbers[count]) {
                largest = numbers[count];
            }

        }

    return largest;
    }
        public static int smallest(int[] numbers) {

        int smallest = numbers[0];

        for(int count = 0; count < numbers.length; count++) {
            if(smallest > numbers[count]) {
                smallest = numbers[count];
            }

        }

        return smallest;

        }



}





