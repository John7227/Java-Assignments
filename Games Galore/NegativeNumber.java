import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int sum = 0;
	int number = 0;
	int value = 0;

	for(int count = 1; count <= 100; count ++) {

	    System.out.print("Enter Number: ");
	    number = input.nextInt();


		if(number < 0) {
		    System.out.print("You've just entered a Negative number!\n");
		    break;
		}

	    sum += number;

	value = sum / count;

	}
	
	System.out.println("The Sum is " + sum);
	System.out.println("The Average of all positive numbers entered is: " + value);

    }

}