/*Collect an integer from user using Scanner
If it is greater than zero print positive*/

import java.util. Scanner;

public class Positive {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Number: ");
	int number = input.nextInt();

	if (number > 0) {
	System.out.println("Positive");
	}
	else {
	System.out.println("Negative");
	}

    }

}