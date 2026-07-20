/*Collect Radius from the user
Compute the area of circle which the */

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Radius: ");
	double radius = input.nextDouble();

	double area = radius * radius;
	double areaOfCircle = 3.14150 * radius * radius;

	System.out.printf("Area Of Circle = %.2f", areaOfCircle);

    }

}