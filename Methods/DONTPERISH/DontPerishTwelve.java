import java.util.Scanner;

public class DontPerishTwelve {

    public static int remainder(int firstNumber, int secondNumber) {
    int remainder = secondNumber % firstNumber;
    return remainder;
    }





    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	System.out.print(remainder(firstNumber, secondNumber));
    }

}