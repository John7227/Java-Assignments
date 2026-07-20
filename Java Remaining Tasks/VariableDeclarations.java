/*Collect the student name
colleect the student age
and print it to show Hello [name] You are [age] years old*/

import java.util.Scanner;

public class StudentNameAndAge {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your Name: ");
	String name = input.nextLine();

	System.out.print("Enter your Age: ");
	int age = input.nextInt();

	System.out.printf("Hello, %s. You are %d years old", name, age);

    }

}