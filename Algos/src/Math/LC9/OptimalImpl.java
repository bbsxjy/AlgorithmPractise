package Math.LC9;

public class OptimalImpl implements PalindromeNumber {
    @Override
    public boolean isPalindrome(int x) {
        if(x >= 0 && x < 9) {
            return true;
        }

        if((x < 0) || (x % 10 == 0)){
            return false;
        }

        int convertedHalfNumber = 0;

        while(x > convertedHalfNumber) {
            int singleDigit = x % 10;
            x /= 10;
            convertedHalfNumber = convertedHalfNumber * 10 + singleDigit;
        }

        return x == convertedHalfNumber || x == convertedHalfNumber / 10;
    }
}
