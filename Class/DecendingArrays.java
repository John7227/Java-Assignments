import java.util.Arrays;

public class DecendingArrays {
    public static int[] decendingOf(int[] numbers) {

        for(int count = 0; count < numbers.length; count++) {
            for(int value = count + 1; value < numbers.length; value++) {
                if(numbers[count] < numbers[value]) {
                    int temp = numbers[count];
                    numbers[count] = numbers[value];
                    numbers[value] = temp;
                }
            }
        }
    return numbers;

    }



    public static void main(String[] args) {

    int[] numbers = {5, 9, 3, 6, 2};

    int[] results = decendingOf(numbers);

    System.out.println(Arrays.toString(results));
    }


}
