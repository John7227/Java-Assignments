import java.util.Scanner;

public class DontPerishNine {
    
    public static int sum(int firstNumber, int secondNumber) {
    int sum = firstNumber + secondNumber;
    return sum;
    }


    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a First Number: ");
	int firstNumber = input.nextInt();

//	sum()

	System.out.print("Enter a Second Number: ");
	int secondNumber = input.nextInt();

	System.out.print(sum(firstNumber, secondNumber));
    }


}