public class NumbersDivisibleBy9 {
    public static void main(String[] args) {

	int count = 1;

	do {
	    if (count % 9 == 0) {
		System.out.println(count);
	    }
	    count++;
	} while (count <= 200);

    }

}