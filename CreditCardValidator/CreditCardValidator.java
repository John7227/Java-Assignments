import java.util.Scanner;;

public class CreditCardValidator {

//    public static int visaCards(int[] creditCardNumbers) {
//
//
//    }






    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Credit Card Numbers: ");
    int creditCardNumbers = input.nextInt();

    //int[] creditCardNumbers = {};

    int counter = 0;

        for(int count = 0; count <= 16; count++) {
        counter++;
            if(counter != 13 || counter != 16) {
                System.out.println("Invalid input");
                break;
            }
            else{
                System.out.println("Sccessful");    
            }

        }







    }





}



//            if(creditCardNumbers[count] != 12 || creditCardNumbers[count] != 15) {
//            System.out.println("Invalid input!");
//            break;
