import java.util.Scanner;

public class DontPerishFifthteen {

    public static boolean equality(int firstNumber, int secondNumber) {
    if(firstNumber == secondNumber) {
    	return true;
    }
	return false;
    }


    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	System.out.print(equality(firstNumber, secondNumber));

    }


}