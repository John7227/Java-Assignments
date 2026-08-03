public class Calculator {

	public static double add(double firstNumber, double secondNumber) {
	double add = firstNumber + secondNumber;
	return add;
	}
	public static double multiply(double firstNumber, double secondNumber) {
	double multiply = firstNumber * secondNumber;
	return multiply;
	}
	public static double divide(double firstNumber, double secondNumber) {
	double divide = firstNumber / secondNumber;
	return divide;
	}
	public static double subtract(double firstNumber, double secondNumber) {
	double subtract = firstNumber - secondNumber;
	return subtract;
	}


	public static double calculate(double firstNumber, double secondNumber, char character) {
	if(character == '+') 
		return add(firstNumber, secondNumber);

	
	else if(character == '*') 
		return multiply(firstNumber, secondNumber);

	
	else if(character == '/') 
		return divide(firstNumber, secondNumber);

	
	else if(character == '-') 
		return subtract(firstNumber, secondNumber);
	
	else
		System.out.println("Invalid Input");
	return 0;
}

	public static void main(String[] args) {

	System.out.println(calculate(10 ,2, '+'));

	}
}
