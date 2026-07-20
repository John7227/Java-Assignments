import java.util.Scanner;

public class TotalNumbers {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 1;
	int sum = 0;

	while (count <= 5) {
    	    System.out.print("Enter Number: ");
	    int number = input.nextInt();		
	count++;
	sum += number;
	}

	System.out.printf("The Total = %d", sum);
    }

}