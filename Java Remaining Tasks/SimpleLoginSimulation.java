/*First off, to receive input from the user, Scanner will be used
Then, I ask for some details from the user, like:
UserName, Email and Password, if it is correct it stops, if it is not it the code continues*/


import java.util.Scanner;

public class SimpleLoginSimulation {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 1;

	do {
	    System.out.print("Enter your Email: ");
	    String email = input.nextLine();
	    input.nextLine();
	    System.out.print("Enter your Pin: ");
	    int pin = input.nextInt();
	    count++;
	} while (count <= 100);

    }

}