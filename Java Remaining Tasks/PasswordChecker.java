import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 1;
	String theRightPassword = "John";

	while (count <= 10000000) {
    	    System.out.print("Enter Your Password: ");
	    String password = input.nextLine();

		if(password.equals(theRightPassword)) {
		    System.out.println("Correct!");
		    break;
		}
		else {
		    System.out.println("Incorrrect!");
		}

		
	count++;
	}

    }

}