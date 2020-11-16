package Dp.LC5;

import java.util.HashSet;
import java.util.Set;

public class NaiveImpl implements LongestPalindromicSubstring {
    @Override
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        Set<String> substringSet = getSubstringSet(s);
        Set<String> reversedSubstringSet
                = getSubstringSet(getReversedString(s));
        String longestPalindrome = "";

        for (String str : substringSet) {
            if(reversedSubstringSet.contains(str)
                    && (str.length() > longestPalindrome.length())
                    && isPalindrome(str)) {
                longestPalindrome = str;
            }
        }

        return longestPalindrome;
    }

    private Set<String> getSubstringSet(final String s) {
        Set<String> subStrSet = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                subStrSet.add(s.substring(i,j));
            }
        }
        return subStrSet;
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

    private boolean isPalindrome(final String s) {
        return s.equals(getReversedString(s));
    }
}
