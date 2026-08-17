public class Mode {
//
//    public static int modeOf(int[] numbers) {
//
//        int counter = 0;
//        for(int count = 0; count < numbers.length; count++) {
//            for(int value = 0; value < numbers.length; value++) {
//                if(numbers[count] == numbers[value]) {
//                    counter = numbers[count];           
//                }
//            }
//        }
//        return counter;
//    }


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











    public static int[] sortingOfTheTwoLists(int[] list1, int[] list2) {

    int[] merge = new int[list1.length + list2.length];

    int counter = 0;
        for(int count = 0; count < list1.length; count++) {
            for(int value = count + 1; value < list1.length; value++) {
                if(list1[count] == list1[value]) {
                    merge[counter] = list1[count];
                    counter++;
                }
            }
        }

        for(int count = 0; count < list2.length; count++) {
            for(int value = count + 1; value < list2.length; value++) {
                if(list2[count] == list2[value]) {
                    merge[counter] = list2[value];
                    counter++;
                }
            }
        }

//        for(int count = 0; count < merge.length; count++) {
//            for(int value = count + 1; value < merge.length; value++) {
//                if(merge[count] > merge[value]) {
//                    int temp = merge[count];
//                    merge[count] = merge[value];
//                    merge[value] = temp;
//                }
//            }
//        }
    return merge;
    }







//    public static int[] sortingOfTheTwoLists(int[] list1, int[] list2) {
//
//    int[] merge = new int[list1.length + list2.length];
//
//    int counter = 0;
//        for(int count = 0; count < list1.length; count++) {
//            merge[counter] = list1[count];
//            counter++;
//        }
//
//        for(int value = 0; value < list2.length; value++) {
//            merge[counter] = list2[value];
//            counter++;
//        }
//
//        for(int count = 0; count < merge.length; count++) {
//            for(int value = count + 1; value < merge.length; value++) {
//                if(merge[count] > merge[value]) {
//                    int temp = merge[count];
//                    merge[count] = merge[value];
//                    merge[value] = temp;
//                }
//            }
//        }
//    return merge;
//    }
//
//}


//
//    public static int[] distinctNumbers(int[] numbers) {
//
//    int[] distinct = new int[numbers.length];
//
//    //    int counter = 0;
//        for(int count = 0; count < numbers.length; count++) {
//            int counter = 0;
//            numbers[count];
//            counter++;
//        }
//
//    return distinct;    
//    }







public static int modeOf(int[] array) {
    
    int index = 0;
    int number = 0;
    for (int count = 0; count < array.length; count++) {
    int counter = 1;
        for (int num = count + 1; num < array.length; num++) {
            if (array[count] == array[num]) {
                counter++;
            }
        }

        if (counter > number) {
            number = counter;
            index = array[count];
        }
    }

    return index;
}










































}







