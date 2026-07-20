import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Hours: ");
	int hours = input.nextInt();

	System.out.print("Enter Minutes: ");
	int minutes = input.nextInt();

	int totalMinutes = (hours * 60) + minutes;

	int finalHours = (totalMinutes / 60) % 24;

	int finalMinutes = totalMinutes % 60;

	System.out.printf("Time: %d:%d", finalHours, finalMinutes);

    }

}