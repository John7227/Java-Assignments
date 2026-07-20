import java.util.Scanner;

public class SumLoops {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	    int sum = 0;

	    for (int count = 1; count <= 100; count++) {
		sum += count;
	    }	
		System.out.print(sum);

    }

}