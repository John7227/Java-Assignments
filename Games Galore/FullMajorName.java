NOT

import java.util.Scanner;

public class FullMajorName {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

//	String one = "Freshman";

	System.out.print("Enter Student's Major: ");
	String major = input.nextLine();

	System.out.print("Enter a digit 1-4 representing your Year: ");
	int digit = input.nextInt();

	String digit = "";

	if (digit = "1") {
	    digit = "Freshman";
	}
	else if (digit == "2") {
	    digit = "Sophomore";
	}
	else if (digit == "3") {
	    digit = "Junior";
	}
	else if (digit == "4") {
	    digit = "Senior";
	}
	else {
	    System.out.print("Invalid input!");
	}

	System.out.printf("%nMajor is " + major + "%nYear Status is " + digit);
    }

}