import java.util.Scanner;

public class DontPerishEleven {

    public static double decimalDivision(double firstNumber, double secondNumber) {
    double decimalDivision = firstNumber / secondNumber;
    return decimalDivision;
    }



    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	double firstNumber = input.nextDouble();

	System.out.print("Enter Second Number: ");
	double secondNumber = input.nextDouble();

	System.out.print(decimalDivision(firstNumber, secondNumber));

    }

}