import java.util.Scanner;

public class NPowerOf2 {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Number: ");
	int number = input.nextInt();

	int power = 1;

	for(int count = 1; count <= number; count++) {
	    power *= 2;
	    System.out.println(power);
	}
    }

}