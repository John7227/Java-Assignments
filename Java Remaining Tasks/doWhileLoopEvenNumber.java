public class doWhileLoopEvenNumber {
    public static void main(String[] args) {

	int count = 2;

	do {
	    count++;
		if (count % 2 == 0) {
		    System.out.println(count);
		}
	} while (count <= 40);
    }

}