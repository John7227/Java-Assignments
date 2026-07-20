import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Number: ");
	int smallest = input.nextInt();

	int count = 1;

	while (count <= 5) {
	    System.out.print("Enter Number: ");
	    int number = input.nextInt();

		if (smallest > number) {
		smallest = number;
		}
	    count++;
	}
		System.out.printf("The Smallest Number = %d", smallest);
    }

}