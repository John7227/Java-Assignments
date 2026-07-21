import java.util.Scanner;

public class DontPerishFour {

    public static int absoluteValue(int number) {
    int absoluteValue = number;
    if (number < 0) {
	return number = - number;
    }
    return absoluteValue;
    }



    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a Number: ");
	int number = input.nextInt();

	System.out.print(absoluteValue(number));

    }

}