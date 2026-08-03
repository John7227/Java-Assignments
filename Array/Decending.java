import java.util.Arrays;

public class Decending {
	public static int[] decending(int[] numbers) {

		for(int count = 0; count < numbers.length; count++) {
			int temp = numbers[0];
				for(int value = 0; value < numbers.length; value++) {
					if(numbers[count] > numbers[value]) {
					temp = numbers[count];
					numbers[count] = numbers[value];
					numbers[value] = temp;
					}
				}
		}

		return numbers;
	}


	public static void main(String[] args) {

	int[] numbers = {14, 50, 56, 46, 80};
	
	int[] number = decending(numbers);

	System.out.println(Arrays.toString(numbers));
	}
}
