public class HowManyNumbersExist {
    public static void main(String[] args) {

	int count = 1;
	int sum = 0;

	while (count <= 100) {		
	    sum += 1;
	    count++;
	}
	    System.out.print(sum);
    }

}