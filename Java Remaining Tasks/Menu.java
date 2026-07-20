import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 1;

	do {
	    System.out.print("Enter your Email: ");
	    String email = input.nextLine();
	    input.nextLine();
	    System.out.print("Enter your Password: ");
	    String password = input.nextLine();
	    count++;
	} while (count <= 100);

    }

}