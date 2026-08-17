import java.util.Arrays;

public class StrictlyIdenticalArrays {



    public static boolean strictlyIdenticalArraysOf(int[] list1, int[] list2) {

            if(list1.length != list2.length) {
                return false;
            }
            for(int count = 0; count < list1.length; count++) {
                if(list1[count] != list2[count]) {
                    return false;
                }
            }

        return true;
    }




    public static boolean isConsecutiveFour(int[] values) {

        int counter = 1;
        for(int count = 0; count < values.length - 1; count++) {   
            if(values[count] == values[count + 1]) {
                counter++;

                if(counter == 4) {
                    return true;
                }

            }
                else {
                    counter = 1;
                }
            
        }

    return false;
    }



}





