/*Collect input from the user
initialize the starting count
Also initialize sum so it will be adding up the numbers that are entered by the user
And inside the loop the question where I am asking for the user's number should be iterating */

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 1;
	int sum = 0;

	do {
	    System.out.print("Enter Number: ");
	    int number = input.nextInt();
	    sum += number;
	    count++;
	} while (count <= 5);
	    System.out.print("The Sum = " + sum);

    }

}