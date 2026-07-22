import java.util.Scanner;

public class PrimeNumber {

    public static int divideNumber(int number){
     int sum = 0;
    
    for(int count = 2; count <= number; count++){

    while(number % count == 0){

        sum += count;
        number = number / count;

        }
        }
        return sum;

	}



    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int number = input.nextInt();

    int sumResult = divideNumber(number);

    System.out.println("The Sum of prime number is " + sumResult);

    }



}
