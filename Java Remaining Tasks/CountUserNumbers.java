import java.util.Scanner;

public class CountUserNumbers {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 1;
	int userAttempts = 55555;
	int sum = 0;

	do {
	    System.out.print("Enter Number: ");
	    int number = input.nextInt();
	    sum += 1;
	    count++;
		if (number == userAttempts){
		    System.out.print("Successful!");
		    break;
		}
	} while (count <= 10000);
	    System.out.printf("%nThe User attempted %d times before it became successful", sum);

    }

}