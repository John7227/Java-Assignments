/*The output is greater than 70 which is going to print C because that is the condition that is true so it prints what is in the block of code*/

public class OutputScore {
    public static void main(String[] args) {

	int score = 72;
	
	String grade;

	if (score >= 90) grade = "A"; 

	else if (score >= 80) grade = "B";

	else if (score >= 70) grade = "C";

	else grade = "F";

	    System.out.println("Grade: " + grade);



    }


}