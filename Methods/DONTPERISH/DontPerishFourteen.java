import java.util.Scanner;

public class DontPerishFourteen {

    public static int smallestNumber(int smaller, int secondNumber) {
    if(secondNumber < smaller) {
    return secondNumber;
    }
    return smaller;
    }



    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	int smaller = input.nextInt();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	System.out.print(smallestNumber(smaller, secondNumber));

    }


}