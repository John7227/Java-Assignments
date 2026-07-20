/*Collect three numbers from the user
declare first number as the largest because I am finding the largest
then I check if it is smaller than second numnber if so then number becomes kargest number
same as third number if if it is larger than all it bacomes the largest*/

import java.util.Scanner;

public class LargestNumber {
     public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	int largest = input.nextInt();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter Third Number: ");
	int thirdNumber = input.nextInt();

	if (largest < secondNumber && thirdNumber < secondNumber) {
	    largest = secondNumber;
	}
	else if (largest < thirdNumber) {
	    largest = thirdNumber;
	}

	System.out.printf("%nThe Largest Number is %d", largest);

    }

}