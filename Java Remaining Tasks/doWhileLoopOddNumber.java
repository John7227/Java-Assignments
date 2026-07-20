public class doWhileLoopOddNumber {
    public static void main(String[] args) {

    	int count = 1;

	do {
	    count++;
		if (count % 2 != 0) {
		    System.out.println(count);
		}
	} while (count <= 41);
    }

}