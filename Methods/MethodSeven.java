public class MethodSeven {

	public static boolean isRange(int n, int low, int high) {
	int number = n;

	if (number > low && number < high) {

	} 
	return true;
	}

	public static void main(String[] args) {
	boolean isRangeResult = isRange(30, 10, 50);
	System.out.print(isRangeResult);

	}

}