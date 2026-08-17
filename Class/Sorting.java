import java.util.Arrays;

public class Sorting {
    public static int[] sortingOf(int[] numbers) {

    int counter = 0;

    for(int count = 0; count < numbers.length; count++) {
        for(int value = count + 1; value < numbers.length; value++) {
            if(numbers[count] > numbers[value]) {
                int temp = numbers[count];
                numbers[count] = numbers[value];
                numbers[value] = temp;
                counter++;
            }
        }

    }
    return numbers;
}

    public static void main(String[] args) {

    int[] numbers = {5, 9, 3, 6, 2};
    int[] results = sortingOf(numbers);

    System.out.println(Arrays.toString(results));

    }


}




//
//    for(int count = 0; count < numbers.length; count++) {
//        for(int value = 0; value < numbers.length; value++) {
//            if(numbers[count] > numbers[value]) {
//                temp = numbers[count];
//                numbers[count] = numbers[value];
//                numbers[value] = temp;
//                median = numbers[3];
//                if(median % 2 == 0) {
//                    median += median;    
//                }
//            }
//        }
//    
//    }
//


