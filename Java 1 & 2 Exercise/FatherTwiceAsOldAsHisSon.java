/*Collect current father age from the user
Collect current son age from the user
Then get the twice age of the son which will be current age of the son plus current age of the son
Then I will get the father twice age which will be the current father age minus the twice son age, I got the son's twice age.
What if x2 of the son's age is older than the father that will give me a minus that is where an if statement comes in which will be if the twice father age is lower than 0 print the current age of the son plus the current age of the son
Else print the one we did before*/


import java.util.Scanner;

public class FatherTwiceAsOldAsHisSon {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Current Father Age: ");
	int currentFatherAge = input.nextInt();

	System.out.print("Enter Current Son Age: ");
	int currentSonAge = input.nextInt();
	
	int twiceSonAge = currentSonAge + currentSonAge;

	int fatherTwiceAsOldAsHisSon = currentFatherAge - twiceSonAge;

	int ageFatherWillBe = twiceSonAge - currentFatherAge;

	if(fatherTwiceAsOldAsHisSon < 0) {
		System.out.println("In " + ageFatherWillBe + " Years, his father will becomes twice the age of his Son");
	}
	else {

	System.out.print(fatherTwiceAsOldAsHisSon + " Years ago, the father was twice as old as his Son" );
	}

    }


}