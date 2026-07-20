import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Your Name: ");
	String name = input.nextLine();

/*	System.out.print("Enter Your Age: ");
	int age = input.nextInt();

	if (age > 18) {
	    System.out.printf("%s is an adult", name);
	}
	if (age < 18) {
	    System.out.printf("%s is a Child", name);
	}*/

	System.out.printf("My Name is %s", name);

}
}