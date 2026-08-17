import java.util.Arrays;

import java.util.Scanner;

public class StudentGradeScore {

    public static int[] numberOfStudentsOf(int numberOfStudents) {

    Scanner input = new Scanner(System.in);

        int scores = 0;
        int[] theScores = new int[numberOfStudents];

            int counter = 0;

            for(int count = 1; count <= numberOfStudents; count++) {

                System.out.print("Enter Score " + count + ": ");
                scores = input.nextInt();

                theScores[counter] += scores;
    
                counter++;

            }
    
    return theScores;
    
    }




    public static int bestOf(int[] theScores) {

        int best = theScores[0];
        for(int count = 0; count < theScores.length; count++) {
            if(theScores[count] > best) {
                best = theScores[count];
            }
        }  
    return best; 
    }


    
    public static void grade(int[] numberOfStudentsOf, int best) {

        String studentGrade;

        for(int count = 0; count < numberOfStudentsOf.length; count++) {
            int score = numberOfStudentsOf[count];

            if(score >= best - 10) {
              System.out.println("Student " + count + " score is " + numberOfStudentsOf[count] + " and grade is A");
            }
            else if(score >= best - 20) {
              System.out.println("Student " + count + " score is " + numberOfStudentsOf[count] + " and grade is B");
            }
            else if(score >= best - 30) {
              System.out.println("Student " + count + " score is " + numberOfStudentsOf[count] + " and grade is C");
            }
            else if(score >= best - 40) {
              System.out.println("Student " + count + " score is " + numberOfStudentsOf[count] + " and grade is C");
            }
            else {
              System.out.println("Student " + count + " score is " + numberOfStudentsOf[count] + " and grade is F");
            }

//              System.out.println("Student " + count + " score is " + numberOfStudentsOf[count] + " and grade is" + studentGrade);


        }

    }







    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of students: ");
    int numberOfStudents = input.nextInt();

    int[] results = numberOfStudentsOf(numberOfStudents);
    System.out.println(Arrays.toString(results));

    int highestScores = bestOf(results);
    System.out.println(highestScores);

    grade(results, highestScores);

    }

}






