/*Use Scanner to collect two numbers from the user's
Then, use if/ else to print the larger of the two, the smaller, and whether they are equal*/


import java.util.Scanner;

public class SelectionStatementOfAge {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	int firstNumber = input.nextInt();	

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	int larger = firstNumber;
	int smaller = secondNumber;


	if (firstNumber < secondNumber) {
	    larger = secondNumber;
	}
	if (secondNumber > firstNumber) {
	    smaller = firstNumber;
	}
	    System.out.printf("Larger = %d%nSmaller = %d%n", larger, smaller);

	if (firstNumber == secondNumber) {
	    System.out.println("They are equal");
	}
	else {
	    System.out.println("They are NOT equal");
	}

    }

}