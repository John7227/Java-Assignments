import java.util.Scanner;

public class DontPerishEight {

    public static void asterisks(int number) {
    for(int count = 1; count <= number; count++) {
	System.out.print("*");
    }
//    return asterisks;

    }



    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a Number: ");
	int number = input.nextInt();

	asterisks(number);

//	System.out.print(asterisks(number));

    }


}