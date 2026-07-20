import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int monday = 0;
	int tuesday = 0;
	int wednesday = 0;
	int thursday = 0;
	int friday = 0;
	int saturday = 0;
	int sunday = 0;

	System.out.print("Enter Number: ");
	int number = input.nextInt();

		if (number % 7 == 0) {
			System.out.print("Wednesday");
		}
		if (number % 7 == 1) {
			System.out.print("Thursday");
		}
		if (number % 7 == 2) {
			System.out.print("Friday");
		}
		if (number % 7 == 3) {
			System.out.print("Saturday");
		}
		if (number % 7 == 4) {
			System.out.print("Sunday");
		}
		if (number % 7 == 5) {
			System.out.print("Monday");
		}
		if (number % 7 == 6) {
			System.out.print("Tuesday");
		}
		if (number % 7 == 7) {
			System.out.print("Wednesday");
		}

    }


}
