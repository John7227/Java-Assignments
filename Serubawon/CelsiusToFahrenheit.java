/*import your Scanner 
Request for the temperature from the user in Celsius
Now use the formula to convert it to fahrenheit*/

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Temperature in Celsius: ");
	double celsius = input.nextLine();

	double fahrenheit = (celsius * 9/5) + 32;

	System.out.printf("Your Temperature in Fahrenheit = %f", fahrenheit);

    }

}