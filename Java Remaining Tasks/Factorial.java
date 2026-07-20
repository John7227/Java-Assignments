public class Factorial {
    public static void main(String[] args) {

	int count = 5;
	int factorial = 1;

	while (count >= 1) {
	    factorial *= count;
	    count--;
	}
	    System.out.printf("The Factorial of 5 is: %d", factorial);
    }

}