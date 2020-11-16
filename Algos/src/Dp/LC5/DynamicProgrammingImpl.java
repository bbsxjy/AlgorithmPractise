package Dp.LC5;

public class DynamicProgrammingImpl implements LongestPalindromicSubstring {
    @Override
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        int len = s.length();
        int startPos = 0, endPos = 0;
        boolean[][] visitMap = new boolean[len][len];

        for (int i = len - 1; i >=0; i--) {
            for (int j = i; j < len; j++) {

                if ((s.charAt(i) == s.charAt(j)
                        && ((j - i < 3) || visitMap[i + 1][j - 1]))) {

                    visitMap[i][j] = true;

                    if ((j - i) > (endPos - startPos)) {
                        endPos = j;
                        startPos = i;
                    }
                }

            }
        }

        return s.substring(startPos, endPos + 1);
    }
}
