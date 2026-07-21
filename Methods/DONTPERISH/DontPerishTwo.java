import java.util.Scanner;

public class DontPerishTwo {

    public static int adding(int number) {
    int adding = number + 10;
    return adding;
    }



    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a Number: ");
	int number = input.nextInt();

	System.out.print(adding(number));
    }

}