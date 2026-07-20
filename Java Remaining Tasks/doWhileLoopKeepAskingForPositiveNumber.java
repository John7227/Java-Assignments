import java.util.Scanner;

public class doWhileLoopKeepAskingForPositiveNumber {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 1;

	do {
	    System.out.print("Enter your positive number: ");
	    int positiveNumber = input.nextInt();

	    count++;
	} while (count <= 10000);	


    }

}