public class TwinPrimeNumber {
    public static void main(String[] args) {

	int prime = 0;
	int counter = 0;

	for(int count = 1; count <= 1000; count++) {
	    for(int value = 2; value <= 1000; value++) {
	    	    if(count % value == 1 && count % value == count) {
			counter++;
//		     if(counter == 2){
		  	  System.out.println(counter);
//		     }
	     	     }

		}

	}



    }

}