public class WhileMultiplication {
    public static void main(String[] args) {

	int count = 1;
	int number = 12;

	while (count <= 12) {
	    int total = number * count;
	    System.out.printf("%d * %d = %d%n", number, count, total);
	count++;
	}
    }

}