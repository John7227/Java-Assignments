import java.util.Scanner;

public class NumbersUntil0 {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 1;

	while (count <= 10000000) {
    	    System.out.print("Enter Number: ");
	    int number = input.nextInt();
		if (number == 0) {
		    break;
		}		
	count++;
	}

    }

}