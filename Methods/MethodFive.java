public class MethodFive {

    public static int isNegative(int n) {
    int isNegative = n * 2;
    return isNegative;
    }


    public static void main(String[] args) {
    int number = isNegative(5);

	if (number < 0) {
		System.out.print("True");
	}
	else {
		System.out.print("False");
	}



    }


}