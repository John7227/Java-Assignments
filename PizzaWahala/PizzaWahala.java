public class PizzaWahala {

    public static int numberOfSlices() {

    int numberOfSlices = 12;
    return numberOfSlices;
    }



    public static int pricePerBox() {

    int pricePerBox = 5200;
    return pricePerBox;
    }


    public static int calculateBoxes(int numberOfPeople, int numberOfSlices) {

        int boxes = 0;

        if(numberOfPeople % numberOfSlices != 0) {
        boxes = numberOfPeople / numberOfSlices + 1;
        }

        else{
        boxes = numberOfPeople / numberOfSlices;    
        }

    return boxes;
    }



    public static int numberLeftOverSlices(int numberOfPeople, int numberOfSlices) {

    int numberLeftOverSlices = numberOfPeople / numberOfSlices;

    return numberLeftOverSlices;
    }



    public static int price(int pricePerBox) {

    int price = pricePerBox * calculateBoxes();
    return price;
    }



    public static void main(String[] args) {

    int numberOfpeople = 45;

    String pizzaType = "Odogwu";
    
    numberOfSlices();

    
    System.out.println(calculateBoxes(numberOfpeople));

    }

}





