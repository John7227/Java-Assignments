/*Collect the first Score from the user
Collect the second Score from the user
Collect the third Score from the user
Then get the total of the scores which will addition of the three scores
Then get the average which will be the total divided by 3
Then if the average falls between the range of 90 to 100 it should print A
If the average falls between the range of 80 to 90 it should print B
If the average falls between the range of 70 to 80 it should print C
If the average falls between the range of 60 to 70 it should print D
If the average falls between the range of 0 to 60 it should print F*/


import java.util.Scanner;

public class AverageOfThreeScores {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter First Score: ");
	int firstScore = input.nextInt();

	System.out.print("Enter Second Score: ");
	int secondScore = input.nextInt();

	System.out.print("Enter First Score: ");
	int thirdScore = input.nextInt();

	int totalScore = firstScore + secondScore + thirdScore;

	int average = totalScore / 3;

	System.out.println("The Total is " + totalScore);

	if(average >= 90 && average <= 100) {
		System.out.print("A");
	}
	else if(average >= 80 && average < 90) {
		System.out.print("B");
	}
	else if(average >= 70 && average < 80) {
		System.out.print("C");
	}
	else if(average >= 60 && average < 70) {
		System.out.print("D");
	}
	else if(average >= 0 && average < 60) {
		System.out.print("F");
	}

    }


}