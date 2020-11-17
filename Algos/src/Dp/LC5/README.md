## Thought process

### General
##### What will be the substring of "abcd"?

```
a
ab
abc
abcd
```
```
b
bc
bcd
```
```
c
cd
```
```
d
```

##### Total number of variations

4+3+2+1 = 10

Total variation: n*(n+1)/2 (-1) if not include itself.

##### How can I get all substring?
1. Numerate from a->d

### Optimal
1. Firstly, the fact that if a string is palindrome, then it must follow the smallest palindrome rules:
    1. length is 1 -> palindromic at self character: "a"
    2. length is 2 -> palindromic at double identical character: "aa"
    3. length is 3 -> palindromic at random center of a triple character: "a#a"
2. So it must be true, when we try to expand the current string S[i...j] systematic by 1 from both left and right side, the outer
elements are still equal which means the new string S[i-1 ... j+1] is still palindrome.
3. After we are getting the expanded substring, we can compare both 1.a and 1.b length to determine the local maximum.
    1. The reason why 1.c is not considered is that the expanded 1.a will cover 1.c
4. Finally, update the global maximum to get the longest palindromic substring.
5. BigO, Time->O(n^2), Space->O(1) 

### Dynamic Programming
1. Create visiting boolean map
2. Every pair (i,j) value should be determined by 
    1. S[i] == S[j]
    2. Since we explore the substring from inside to outside(i...j, i-1...j+1 and so on.), we need to check if the 
    S[i-1] == S[j+1] to avoid redundant calculations.
    3. If the distance between i and j is
        1. 0 -> palindromic at self character: "a"
        2. 1 -> palindromic at double identical character: "aa"
        3. 2 -> palindromic at random center of a triple character: "a#a"
    4. Since the distance >= 3 meaning that, it should include the shorter palindromes already.
3. Finally, we need to save the startPos and endPos to save time complexity.
4. BigO, Time->O(n^2), Space->O(n^2) 
    
### Naive
1. Get substring of current input
2. Get substring of reversed current input
3. Compare all those substrings, check if
    1. They are identical
    2. They are palindromic
    3. Their length and record it.
4. BigO, Time->O(n^3), Space->O(n)    
