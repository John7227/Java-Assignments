import java.util.Arrays;

public class SumFromFirstForward {
    public static int[] sumFromFirstForward(int[] numbers) {

    int counter = 0;
    int[] number = new int[numbers.length];

        for(int count = 0; count < numbers.length; count++) {
            counter += numbers[count];
            number[count] = counter;

        }
    return number;
    }

    public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4};
    int[] results = sumFromFirstForward(numbers);

    System.out.println(Arrays.toString(results));

    }


}









