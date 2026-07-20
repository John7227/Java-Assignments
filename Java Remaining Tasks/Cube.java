public class Cube {
    public static void main(String[] args) {

	for (int count = 1; count <= 10; count++) {
	    int number = count;
	    number = number * number * number;
	    System.out.printf("%nThe Cube of %d = %d", count, number);

	}
    }

}