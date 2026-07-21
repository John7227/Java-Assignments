import java.util.Scanner;

public class DontPerishOne {

    public static int cube(int number) {
    int cube = number * number * number;
    return cube;
    }




    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a Number: ");
	int number = input.nextInt();


	System.out.print(cube(number));

    }


}