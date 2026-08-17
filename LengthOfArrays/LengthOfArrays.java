public class LengthOfArrays {
    public static int lengthOfArrays(String[] words) {

//        String counter = "0";
//
//        for(int count = 0; count <= words.length; count++) {
//            String numbers = words[count];
//            counter++;
//        }
//    return counter;


    
    
    int counter = 0;

    for(String word: words) {

        counter++;
    }

    return counter;

    }  
}

//
// 1. Initialize text as a raw char array (No hidden String functions)
//        char[] textArray = {'C', 'A', 'T'};
//        
//        // 2. Set up our counter variable
//        int count = 0;
//
//        // 3. Deitel Section 7.6 Enhanced for loop:
//        // This automatically visits every single character box in order
//        for (char letter : textArray) {
//            
//            // Every time the loop finds a letter, increment the counter by 1
//            count++; 
//        }
//
//        // 4. Output the result
//        System.out.printf("Total characters: %d%n", count);
//
//








//    int counter = 0;
//
//    while(words != 0) {
//        (words % 10) / 10;
//    counter++;
//    }
//    return counter;  
//    }
//
//}












//public class LengthOfArrays {
//    public static int lengthOfArrays(String[] words) {
//
//        int num = 0;
//        for(int count = 0; count < words.length; count++) {
//            num = words.length;
//        }  
//    return num;  
//    }
//
//
//    public static void main(String[] args) {
//
//    String[] words = {"Lawrence", "Joh", "Into"};
//    
//    System.out.println(lengthOfArrays(words));    
//    }
//
//}








