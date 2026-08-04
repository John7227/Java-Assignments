public class PizzaWahala {

    public static int numberOfSlices(String pizzaType) {
    
        if(pizzaType.equals("Sapa size")) {
            return 4;
        }
        else if(pizzaType.equals("Small Money")) {
            return 6;
        }
        else if(pizzaType.equals("Big boys")) {
            return 8;
        }
        else if(pizzaType.equals("Odogwu")) {
            return 12;
        }
    
    return 0;
    }



    public static int pricePerBox(String pizzaType) {

        if(pizzaType.equals("Sapa size")) {
            return 2500;
        }
        else if(pizzaType.equals("Small Money")) {
            return 2900;
        }
        else if(pizzaType.equals("Big boys")) {
            return 4000;
        }
        else if(pizzaType.equals("Odogwu")) {
            return 5200;
        }
    
    return 0;

    }


    public static int calculateBoxes(int numberOfPeople, int numberOfSlices) {

        if(numberOfPeople % numberOfSlices != 0) {
        return numberOfPeople / numberOfSlices + 1;

        }

        return numberOfPeople / numberOfSlices;  

    }



    public static int numberLeftOverSlices(int numberOfPeople, int numberOfSlices, int boxes) {

    return boxes * numberOfPeople - numberOfPeople
    }


    public static int price(int boxes, int pricePerBox) {

    int price = pricePerBox * calculateBoxes();
    return price;
    }



    public static int result(String[] args) {

    int numberOfpeople = 45;

    String pizzaType = "Odogwu";
    
    numberOfSlices();

    pricePerBox();

    calculateBoxes();

    numberLeftOverSlices();

    price();


    System.out.println(calculateBoxes(numberOfpeople));

    return result; 
    }

}





