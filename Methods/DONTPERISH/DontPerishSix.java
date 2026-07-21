import java.util.Scanner;

public class DontPerishSix {

    public static double fahrenheit(double celsius) {
    double fahrenheit = (celsius * 9/5) + 32;
    return fahrenheit;
    }


    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Temperature in Celsius: ");
	double celsius = input.nextDouble();

	System.out.print(fahrenheit(celsius));
    }


}