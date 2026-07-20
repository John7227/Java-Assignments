import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	int firstNumber = input.nextInt();

	input.nextLine();

	System.out.print("Enter Operation Sign(+-/ *): ");
	String sign = input.nextLine();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	if (sign.equals("+")) {
		System.out.println(firstNumber + secondNumber);
	
	}
	else if (sign.equals("-")) {
		System.out.println(firstNumber - secondNumber);
	}
	else if (sign.equals ("/")) {
		System.out.println(firstNumber / secondNumber);
	}
	else if (sign.equals("*")) {
		System.out.println(firstNumber * secondNumber);
	}
	else {
		System.out.print("Sign Not Found!");
	}

    }

}







