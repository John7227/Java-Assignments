/*imort java because I am collecting distance in miles from the user
Convert it to kilometers
And print the both values*/

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Distance in Miles: ");
	double miles = input.nextDouble();

	double kilometers = (1 miles = 1.60934)

	System.out.printf("Distance in Miles %.2f%nDistance in Kilometers", miles, kilometers);

    }

}