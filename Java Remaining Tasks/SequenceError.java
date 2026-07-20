/*The error in that is it is suppose to be sequencially which is line by line that is an error because the last line suppose to come first before the first line, and here is the correct code: */


import java.util.Scanner;

public class SequenceError {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Price: ");
	double price = input.nextDouble();

	System.out.print("Enter Tax: ");
	double tax = input.nextDouble();

	double total = price + tax;
	
	System.out.println(total);

    }

}