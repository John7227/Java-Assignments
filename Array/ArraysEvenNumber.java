import java.util.Arrays;

public class ArraysEvenNumber {

    public static int[] evenNumbers(int[] numbers) {

    int counter = 0;
    

    for(int count = 0; count < numbers.length; count++) {
        if(numbers[count] % 2 == 0) {
            counter++;
        }

    }
    int even[] = new int[numbers.length];
//    int thecount[] = new int[counter];

    int counters = 0;
    int value = 0;
    for(int count = 0; count < numbers.length; count++) {
        if(numbers[count] % 2 == 0) {
        even[counters] = numbers[count];
//        thecount[counters] += value;
            counters++;
        even[counters] = numbers[value];
            value++;

        }
    }

    return even;
    }


    public static int[] count(int[] even) {
        
    }





    public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5};

    System.out.println(Arrays.toString(evenNumbers(numbers)));

    }


}
//
//	 	int odd[] = new int[counter];
//				square[counters] = items[count];

//ArrayKata.sumOfEvenNumbersIn(amount));

