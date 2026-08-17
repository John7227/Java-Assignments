public class PrimeAndPalindrome {

    public static boolean primeAndPalindromeOf(int numbers) {

    int store = numbers;
    int reverse = 0;

        for(int count = 0; store > 0; count++) {
            int hold = store % 10;
            store = store / 10;
            reverse = reverse * 10 + hold;
        }

        if(numbers == reverse) {
            return true;
        }
    return false;
    }

    


}

