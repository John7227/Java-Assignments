public class LeapYears {
    public static void main(String[] args) {

	int counter = 0;

	for(int count = 2000; count <= 2100; count += 4) {
	    System.out.printf("%d, ", count);
	counter++;
	    if (counter % 10 == 0) {
		System.out.println();
	    }
	}

    }

}




//	for(int count = 2000; count <= 2100; count += 4) {
//	    System.out.println(count);
//	}