public class WhileSum {
    public static void main(String[] args) {

	int count = 1;
	int sum = 0;

	while (count <= 50) {
	    sum += count;
	count++;
	}
	    System.out.println(sum);
    }

}