public class CreditCardValidator {

    public static boolean visaCardOf(long creditCardNumbers) {

        int counter = 0;

        while(creditCardNumbers != 0) {
            creditCardNumbers = creditCardNumbers / 10;
            counter++;
        }
            
        if(counter >= 13 && counter <= 16) {
            return true;
        }

    return false;
    }


    public static String typeOfCard(long creditCardNumbers) {

    int counter = 0;

    while(creditCardNumbers >= 10) {
        creditCardNumbers = creditCardNumbers / 10;
        counter++;
    }
    if(creditCardNumbers == 4) {
        return "Visa Cards";
    }
    else if(creditCardNumbers == 5) {
        return "MasterCard";
    }
    
    else if(creditCardNumbers == 6) {
        return "Discover cards";
    }
    else {
        return "Invalid Card Number";
    }

    }


   public static String americanExpressCard(long creditCardNumbers) {

    int counters = 0;

    while(creditCardNumbers >= 40) {
        creditCardNumbers = creditCardNumbers / 10;
        counters++;
    }
    if(creditCardNumbers == 37) {
        return "American Express Cards";
    }

    return "Invalid Card Number";
    }




}



