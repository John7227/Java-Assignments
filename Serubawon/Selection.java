/*To trace this the value of a is 5 and the value of b is 10, so none of the condition is true so it is the else block of code that is printing out that is why "B wins" will be printed*/


public class Selection {
     public static void main(String[] args) {

	int a = 5;
	int b = 10;

	if (a > b) {
	    System.out.print("A wins");
	}
	else if (a == b) {
	    System.out.print("Draw");
	}
	else {
	    System.out.print("B wins");
	}



   }

}