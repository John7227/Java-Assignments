/*import your Scanner to receive data from user which is to read the price of the user
Then calculate the tax as follow in the question
Calculate the total also
And print the total*/

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Price: ");
	double price = input.nextDouble();

	double tax = price * 0.075;
	double total = price + tax;
	
	System.out.printf("The Total = %.2f", total);
    }

}