package Math.LC9;

public class NaiveImpl implements PalindromeNumber{
    @Override
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        if(x < 9) {
            return true;
        }

        String toString = Integer.toString(x);
        String reversedString = getReversedString(toString);

        return toString.equals(reversedString);
    }

    private String getReversedString(final String s) {
        char[] charArr = s.toCharArray();
        char[] reversedCharArr = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >=0 ; i--) {
            reversedCharArr[j] = charArr[i];
            j++;
        }
        return String.valueOf(reversedCharArr);
    }
}
