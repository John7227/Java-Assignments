/*Collect two numbers from the user
And also a operation code that
will be used to find the value*/

import java.util.Scanner;

public class OperationCode {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	double firstNumber = input.nextDouble();

	input.nextLine();

	System.out.print("Enter Operation Code(+,-,*,/): ");
	String code = input.nextLine();

	System.out.print("Enter Second Number: ");
	double secondNumber = input.nextDouble();

	if (code.equals("+")) {
	    System.out.print(firstNumber + secondNumber);
	}
	else if (code.equals("-")) {
	    System.out.print(firstNumber - secondNumber);
	}
	else if (code.equals("*")) {
	    System.out.print(firstNumber * secondNumber);
	}
	else if (code.equals("/")) {
	    System.out.print(firstNumber / secondNumber);
	}

    }


}