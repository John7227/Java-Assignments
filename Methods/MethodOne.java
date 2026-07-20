public class MethodOne {

    public static int division(int a, int b) {
    division = a / b;
    return division;

    }

    public static int multiplication(int a, int b) {
    int multiplication = a * b;
    return multiplication;

    }	

    public static void main(String[] args) {
    int divide = division(50, 20);
    int multi = multiplication (5, 5);

    System.out.println("50 / 20 = " + divide);
    System.out.println("5 * 5 = " + multi);

    }

}