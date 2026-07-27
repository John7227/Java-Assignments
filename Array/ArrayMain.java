public class ArrayMain {
	public static void main(String[] args) {

		 int[] numbers = {15, 19, 23, 89, 88};
		 System.out.println("The Largest Element in the Array is " + ArrayKata.maximumIn(numbers));

		 int[] scores = {22, 24, 45, 29, 69};
		 System.out.println("The Smallest Element in the Array is " + ArrayKata.minimumIn(scores));

		 int[] values = {34, 32, 33, 67, 24};
		 System.out.println("The Sum Of The Elements in the Arrays is " + ArrayKata.sumOf(values));

		 int[] amount = {24, 67, 43, 56, 79};
		 System.out.println("The Sum Of the Even Numbers in the Array is " + ArrayKata.sumOfEvenNumbersIn(amount));

		 int[] number = {34, 67, 24, 67, 33};
		 System.out.println("The Sum Of the Odd Numbers in the Array is " + ArrayKata.sumOfOddNumbersIn(number));

		 int[] score = {106, 45, 67, 39, 97};

		 int[] result = ArrayKata.maximumAndMinimumOf(score);
		 System.out.println("The Minimum Element in the Array is " + (result[0]));
		 System.out.println("The Maximum Element in the Array is " + (result[1]));

		 int[] oddNumbers = {23, 32, 56, 78, 93};
		 System.out.println("The Number of Odd Numbers in the Array is " + ArrayKata.noOfOddNumbersIn(oddNumbers));

		 int[] evenNumbers = {24, 56, 47, 93, 10};
		 System.out.println("The Number of Even Numbers in the Array is " + ArrayKata.noOfEvenNumbersIn(evenNumbers));

		 int[] num = {34, 54, 67, 64, 82};
		 int[] answer = ArrayKata.evenNumbersIn(num);

	 	 System.out.println("These are the Array Of Even Numbers " + (answer[0]));
	 	 System.out.println("These are the Array Of Even Numbers " + (answer[1]));
	 	 System.out.println("These are the Array Of Even Numbers " + (answer[2]));
	 	 System.out.println("These are the Array Of Even Numbers " + (answer[3]));

		 int[] item = {24, 65, 75, 34, 33};
		 int[] total = ArrayKata.oddNumbersIn(item);

		 System.out.println("These are the Array Of Odd Numbers " + (total[0]));
		 System.out.println("These are the Array Of Odd Numbers " + (total[1]));
		 System.out.println("These are the Array Of Odd Numbers " + (total[2]));



		int[] items = {25, 100, 81, 56, 16};
		int[] totals = ArrayKata.squareNumbersIn(items);

		System.out.println("Square Number " + (totals[0]));
		System.out.println("Square Number " + (totals[1]));
		System.out.println("Square Number " + (totals[2]));
		System.out.println("Square Number " + (totals[3]));





	}	
}