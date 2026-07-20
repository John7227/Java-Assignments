/*Collect a score from user in form of an integer using Scanner
If the score is 90-100 print A
if it is 80-89 print B
if it is 70-79 print C
if it is 60-69 print D
if it is below 60 print F*/

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Score: ");
	int score = input.nextInt();

	if (score >= 90 && score <= 100) {
	System.out.print("A");
	}
	else if (score >= 80 && score < 90) {
	System.out.print("B");
	}
	else if (score >= 70 && score < 80) {
	System.out.print("C");
	}
	else if (score >= 60 && score < 70) {
	System.out.print("D");
	}
	else if (score < 60) {
    System.out.print("F");
	}

    }

}