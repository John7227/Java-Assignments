/*Collect a number from user using Scanner
Print Even if it is divided by 2 
And if it is not divided by 2 print Odd*/

import java.util.Scanner;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Number: ");
	int number = input.nextInt();
	
	if (number % 2 == 0) {
	    System.out.print("Even");
	}
	else {
	    System.out.print("Odd");
	}
	

    }

}