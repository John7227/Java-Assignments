import java.util.Scanner;

public class DontPerishTen {

    public static int difference(int firstNumber, int secondNumber) {
    int difference = secondNumber - firstNumber;
    return difference;
    }



    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	System.out.print(difference(firstNumber, secondNumber));

    }

}