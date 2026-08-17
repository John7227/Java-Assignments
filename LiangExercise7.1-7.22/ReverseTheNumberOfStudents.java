import java.util.Arrays;

public class ReverseTheNumberOfStudents {
    public static int[] reverseTheNumbers(int[] numbers) {

        int[] reverse = new int[numbers.length];
        int counter = 0;

        for(int count = numbers.length - 1; count >= 0; count--) {
            reverse[count] = numbers[counter];
            counter++;
        }
    return reverse;
    }



    public static void main(String[] args) {

    int[] numbers = {23, 45, 56, 32, 87, 65, 78, 90, 75, 76};

    int[] results = reverseTheNumbers(numbers);

    System.out.println(Arrays.toString(results));
    }




}
