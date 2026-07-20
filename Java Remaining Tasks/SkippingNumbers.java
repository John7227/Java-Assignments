public class SkippingNumbers {
    public static void main(String[] args) {

	int count = 1;

	while (count <= 100) {
	    if (count % 6 != 0) {
		System.out.println(count);
	    }
	    count++;
	}
    }

}