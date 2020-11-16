package Dp.LC5;

public class OptimalImpl implements LongestPalindromicSubstring {
    @Override
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            String oddSubstring = expandBoundaries(s, i, i);
            String evenSubstring = expandBoundaries(s, i, i + 1);

            if(res.length() < Math.max(oddSubstring.length(), evenSubstring.length())) {
                res = (oddSubstring.length() > evenSubstring.length()) ? oddSubstring : evenSubstring;
            }
        }

        return res;
    }

    private String expandBoundaries(String s, int startPos, int endPos) {
        int i = 0, j = 0;
        while(startPos >= 0
                && endPos < s.length()
                && (s.charAt(startPos) == s.charAt(endPos))) {
            i = startPos;
            j = endPos;
            startPos--;
            endPos++;
        }

        return s.substring(i, j + 1);
    }
}
