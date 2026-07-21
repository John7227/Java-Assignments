import java.util.Scanner;

public class DontPerishThree {

    public static double half(double number) {
    double half = number / 2;
    return half;
    }


    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	double number = input.nextDouble();

	System.out.print(half(number));

    }

}