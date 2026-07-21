import java.util.Scanner;

public class DontPerishFive {


    public static boolean divisible(int number) {
 //   int divisible = number;
    if (number % 3 == 0) {
    return true;
    }
    return false;
    }

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a Number: ");
	int number = input.nextInt();
	
	System.out.print(divisible(number));
    }


}