public class ConsecutiveFour {    

    public static boolean isConsecutiveFour(int[] numbers) {

        int counter = 1;
       for(int count = 0; count < numbers.length - 1; count++) {
            if(numbers[count] == numbers[count + 1]) {
            counter++;

                if(counter == 4) {
                    return true;
                }
            }

        }
    return false;
    }

    public static void main(String[] args) {

    int[] numbers = {3, 4, 5, 5, 5, 5, 4, 5};

    System.out.println(isConsecutiveFour(numbers));
    }

}
