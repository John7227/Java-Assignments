import java.util.Scanner;

public class DontPerishThirteen {

    public static int largestNumber(int largest, int secondNumber) {

    if (secondNumber > largest) {
    return secondNumber;
    }
    return largest;

    }



    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	int largest = input.nextInt();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	System.out.print(largestNumber(largest, secondNumber));
    }

}