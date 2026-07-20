import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Number: ");
	int largest = input.nextInt();

	int count = 1;

	while (count <= 5) {
	    System.out.print("Enter Number: ");
	    int number = input.nextInt();

		if (largest < number) {
		largest = number;
		}
	    count++;
	}
		System.out.printf("The Largest Number = %d", largest);
    }

}