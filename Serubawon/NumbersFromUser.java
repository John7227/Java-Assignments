/*import your Scanner to receive data from user
Now ask two numbers from the users
Add the numbers together
Find their difference
Find their products
And their quotient which simply means divide the two numbers together*/

import java.util. Scanner;

public class NumbersFromUser {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	int numberOne = input.nextInt();

	System.out.print("Enter Second Number: ");
	int numberTwo = input.nextInt();

	int sum = numberOne + numberTwo;
	int difference = numberOne - numberTwo;
	int product = numberOne * numberTwo;
	int quotient = numberOne / numberTwo;

    System.out.printf("The Sum = %d%nThe Difference = %d%nThe Product = %d%nThe Quotient = %d", sum, difference, product, quotient);

    }

}