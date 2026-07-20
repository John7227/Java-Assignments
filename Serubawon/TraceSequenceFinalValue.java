/*The first number was declared with the value of 4 at first, then in the third line first +
second which is 10, and the final place is 10-2 which is 8
And second number was declared 6, then second number states first number multiply 3 which is
the current value of first number which is 8 * 3 and the answer for second number is 24
And the third number is 4 + 6 why, because it is sequencially it is still in the third line
so their values are still at their first pace so the third number is 10 .*/

public class TraceSequenceFinalValue {
    public static void main(String[] args) {

	int firstNumber = 4;
	int secondNumber = 6;
	int thirdNumber = firstNumber + secondNumber;
	firstNumber = thirdNumber -2;
	secondNumber = firstNumber * 3;

System.out.printf("First Number = %d%nSecond Number = %d%nThird Number = %d",firstNumber, secondNumber, thirdNumber);

    }

}