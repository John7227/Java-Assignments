public class doWhileLoopMultiplcation {
    public static void main(String[] args) {

	int count = 1;
	int number = 5;

	do {
	    int product = number * count; 
	    System.out.println(number + " * " + count + " = " + product);
	count++;
	} while (count <= 12);


    }

}

