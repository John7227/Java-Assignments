/*The difference between == and .equals() is that == is for comparing to integers while .equals() is for comparing strings, now this is a sample that of where I will use == and it won't work:*/

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	String realPassword = "Goal";

	System.out.print("Enter Password: ");
	String password = input.nextLine();

	if (password == realPassword) {
	    System.out.print("Correct");
	}
	else {
	    System.out.print("Incorrect");
	}

    }


}