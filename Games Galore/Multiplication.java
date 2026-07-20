public class Multiplication {
    public static void main(String[] args) {

	int number = 5;
	int multiplication = 0;

	for(int count = 1; count <= 12; count++) {
	    multiplication = number * count;
	    System.out.printf("%d * %d = %d%n", number, count, multiplication);
	}
    }

}