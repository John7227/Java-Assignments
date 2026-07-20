/*Collect input from the user using scanner
Initialize count as the starting variable for the loop
inside the body of code for the loop ask the user for their Grade, so it will be iterating
Now, an if statement comes in, and state if what the user enters is = -1 the loop should stop and if it is not it should keep on iterating*/


import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 1;
	do {
	    System.out.print("Enter your Grade: ");
	    int grade = input.nextInt();
		if(grade == -1) {
		break;
		}
	    count++;
	} while (count <= 100);

    }

}