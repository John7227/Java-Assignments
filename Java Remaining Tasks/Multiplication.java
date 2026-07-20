/*Write a code that shows the multiplication table of 9 till*/


public class Multiplication {
    public static void main(String[] args) {

	int number = 9;

	for (int count = 1; count <= 12; count++) {
	int value = number * count;

	    System.out.printf("%n%d * %d = %d", number, count, value);
	}

    }

}