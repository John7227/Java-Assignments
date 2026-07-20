/*COllect unit from the user
if the unit is within the range of 0-100 it should print 50 naira per unit
if the unit is within the range of 101-300 units it should print 75 naira per unit
if the unit is above 300 it should print 100 naira per unit*/

import java.util.Scanner;

public class CompanyUnit {
     public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Unit: ");
	int unit = input.nextInt();

	if (unit >= 0 && unit <= 100) {
	     System.out.print("50 per unit");
	}
	else if (unit >= 101 && unit <= 300) {
	    System.out.print("75 per unit");
	}
	else if (unit > 300) {
	    System.out.print("100 per unit");
	}

	

	

    }

}