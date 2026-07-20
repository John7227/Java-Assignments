/*First of all import Scanner to collect the Iten price from the user
Collect the quantity also from the user
Calculate the subtotal
Calculate the VAT
Calculate the grand total
and print the grand total only*/

import java.util.Scanner;

public class ItemPrice {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Item Price: ");
	double price = input.nextDouble();

	System.out.print("Enter Quantity: ");
	double quantity = input.nextDouble();

	double subtotal = price * quantity;
	double VAT = subtotal * 0.20;
	double grandtotal = subtotal + VAT;
	
	System.out.printf("The Grand Total = %.2f", grandtotal);

    }

}