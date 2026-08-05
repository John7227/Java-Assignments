import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest{
	
    @Test
    public void testThatTheVisaCardisCorrect16() {
    
    //Given
    long creditCardNumbers =  4388576018402626l;

    //When
    boolean actualVisaCard = CreditCardValidator.visaCardOf(creditCardNumbers);

    boolean VisaCard = CreditCardValidator.visaCardOf(creditCardNumbers);
    boolean expectedVisaCard = true;

    //Check
    assertEquals(expectedVisaCard, actualVisaCard);


	}


    @Test
    public void testThatTheVisaCardisCorrect13() {
    
    //Given
    long creditCardNumbers =  4388576018402l;

    //When
    boolean actualVisaCard = CreditCardValidator.visaCardOf(creditCardNumbers);

    boolean VisaCard = CreditCardValidator.visaCardOf(creditCardNumbers);
    boolean expectedVisaCard = true;

    //Check
    assertEquals(expectedVisaCard, actualVisaCard);


	}


    @Test
    public void testThatTheVisaCardisCorrect1() {
    
    //Given
    long creditCardNumbers =  8l;

    //When
    boolean actualVisaCard = CreditCardValidator.visaCardOf(creditCardNumbers);

    boolean VisaCard = CreditCardValidator.visaCardOf(creditCardNumbers);
    boolean expectedVisaCard = false;

    //Check
    assertEquals(expectedVisaCard, actualVisaCard);


	}


    @Test
    public void testThatTheVisaCardisCorrect5() {
    
    //Given
    long creditCardNumbers =  84563l;

    //When
    boolean actualVisaCard = CreditCardValidator.visaCardOf(creditCardNumbers);

    boolean VisaCard = CreditCardValidator.visaCardOf(creditCardNumbers);
    boolean expectedVisaCard = false;

    //Check
    assertEquals(expectedVisaCard, actualVisaCard);


	}


    @Test
    public void testThatTheVisaCardisCorrect10() {
    
    //Given
    long creditCardNumbers =  845637847l;

    //When
    boolean actualVisaCard = CreditCardValidator.visaCardOf(creditCardNumbers);

    boolean VisaCard = CreditCardValidator.visaCardOf(creditCardNumbers);
    boolean expectedVisaCard = false;

    //Check
    assertEquals(expectedVisaCard, actualVisaCard);


	}


    @Test
    public void testThatThetypeOfCardisCorrectVisaCards() {
    
    //Given
    long creditCardNumbers =  4388576018402626l;

    //When
    String actualTypeOfCard = CreditCardValidator.typeOfCard(creditCardNumbers);

    String typeOfCard = CreditCardValidator.typeOfCard(creditCardNumbers);
    String expectedTypeOfCard = "Visa Cards";

    //Check
    assertEquals(expectedTypeOfCard, actualTypeOfCard);


	}

    @Test
    public void testThatThetypeOfCardisCorrectMasterCard() {
    
    //Given
    long creditCardNumbers =  5388576018402626l;

    //When
    String actualTypeOfCard = CreditCardValidator.typeOfCard(creditCardNumbers);

    String typeOfCard = CreditCardValidator.typeOfCard(creditCardNumbers);
    String expectedTypeOfCard = "MasterCard";

    //Check
    assertEquals(expectedTypeOfCard, actualTypeOfCard);


	}



    @Test
    public void testThatThetypeOfCardisCorrectDiscovercards() {
    
    //Given
    long creditCardNumbers =  6388576018402626l;

    //When
    String actualTypeOfCard = CreditCardValidator.typeOfCard(creditCardNumbers);

    String typeOfCard = CreditCardValidator.typeOfCard(creditCardNumbers);
    String expectedTypeOfCard = "Discover cards";

    //Check
    assertEquals(expectedTypeOfCard, actualTypeOfCard);


	}



    @Test
    public void testThatThetypeOfCardisCorrectAmericanExpressCards() {
    
    //Given
    long creditCardNumbers =  3788576018402626l;

    //When
    String actualAmericanExpressCards = CreditCardValidator.americanExpressCard(creditCardNumbers);

    String AmericanExpressCards = CreditCardValidator.americanExpressCard(creditCardNumbers);
    String expectedAmericanExpressCards = "American Express Cards";

    //Check
    assertEquals(expectedAmericanExpressCards, actualAmericanExpressCards);


	}

    @Test
    public void testThatThetypeOfCardisCorrectAmericanExpressCards1() {
    
    //Given
    long creditCardNumbers =  378857602626l;

    //When
    String actualAmericanExpressCards = CreditCardValidator.americanExpressCard(creditCardNumbers);

    String AmericanExpressCards = CreditCardValidator.americanExpressCard(creditCardNumbers);
    String expectedAmericanExpressCards = "Invalid Card Number";

    //Check
    assertEquals(expectedAmericanExpressCards, actualAmericanExpressCards);


	}








}





