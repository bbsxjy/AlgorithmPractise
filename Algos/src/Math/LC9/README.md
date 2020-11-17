## Thought process

### General
This question is EASY to get: if we get the reversed number equals to the original number meaning they are palindromic.

### Optimal
1. If the number is palindromic, we can know that the half of the original number should be equal
2. We just need to compare those two numbers to confirm it's palindrome or not.
3. To get single digit, we can use %
4. To reduce length of number, we can use /10;
5. To get other half reversed number, we can do rn = rn * 10 + singleDigit
6. If the number length is odd, we need to make sure the half reversed number will not include it: by rn / 10
7. We have to make sure the number is not the multiply of 10 since the last digit is 0 will get true all the time. The
first half and the latter half will become 0 at the end after divide the latter half by 10.
    
### Naive
1. Get substring of current input
2. Get substring of reversed current input
3. Compare the two string are the same.
4. BigO, Time->O(n), Space->O(n)    
