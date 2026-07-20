/*Import Scanner to collect data from the user
First, collect the user first name, last name and year of birth
Now to get the the age he/she will be in 2025 or any year you will minus the current year
from the age they were born
And print it in a formatted way*/

import java.util. Scanner;

public class ComputeAge {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Name: ");
	String firstName = input.nextLine();

	System.out.print("Enter Last Name: ");
	String lastName = input.nextLine();

	System.out.print("Enter your Year of Birth: ");
	int yearOfBirth = input.nextInt();

	int currentYear = 2025;
	int age = currentYear - yearOfBirth;

   System.out.printf("My Name is %s %s, I am %d Years Old", firstName, lastName, age);


    }

}