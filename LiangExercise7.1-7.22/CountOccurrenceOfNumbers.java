import java.util.Arrays;

public class CountOccurrenceOfNumbers {
    public static int[] sorting(int[] numbers) {

        for(int count = 0; count < numbers.length; count++) {
            for(int value = count + 1; value < numbers.length; value++) {
                if(numbers[count] > numbers[value]) {
                    int temp = numbers[count];
                    numbers[count] = numbers[value];
                    numbers[value] = temp;
                }
            }
        }

        return numbers;
    }




//    public static void occurrenceOfNumbers(int[] numbers) {
//
//        int counter = 0;
//        int counters = 0
//        for(int count = 1; count < numbers.length; count++) {
//               // System.out.println(numbers[count]);
//            for(int value = count + 1; value < numbers.length; value++) {
//                if(numbers[count] == numbers[value]) {
//                counter++;    
//                }
//            }
//
//            if(counter > 1) {
//                
//            }
//        }
//    }



    public static void main(String[] args) {

    int[] numbers = {2, 5, 6, 5, 4, 3, 23, 43, 2, 0};

    int[] results = (sorting(numbers));
    System.out.println(Arrays.toString(results));

//    int countOccurrenceOfNumbers = occurrenceOfNumbers(results);
//    System.out.println(results);

    occurrenceOfNumbers(results);
    }

}






















































//public class CountOccurrenceOfNumbers {
//    public static int[] sorting(int[] numbers) {
//
//        for(int count = 0; count < numbers.length; count++) {
//            for(int value = count + 1; value < numbers.length; value++) {
//                if(numbers[count] > numbers[value]) {
//                    int temp = numbers[count];
//                    numbers[count] = numbers[value];
//                    numbers[value] = temp;
//                }
//            }
//        }
//
//        return numbers;
//    }
//

//    public static int occurrenceOfNumbers(int[] numbers) {
//
//        int counter = 0;
//        for(int count = 0; count < numbers.length; count++) {
//            for(int value = count + 1; value < numbers.length; value++) {
//                if(numbers[count] == numbers[value]) {
//                counter++;    
//                }
//            }
//        }
//    }













//    for(int count = 0; count < numbers.length; count++) {
//        for(int value = 0; value < numbers.length; value++) {
//            if(numbers[count] == numbers[value]) {
//                counter = numbers[count];
//            }
//        }
//    }
//    return counter;
//    }

