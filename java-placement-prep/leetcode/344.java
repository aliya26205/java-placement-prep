/*344. Reverse String
Solved
Easy
Topics
premium lock icon
Companies
Hint
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]*/
class Solution {
    public void reverseString(char[] s) {
        int j=s.length-1;
        for (int i = 0; i < j; i++) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                j--;
        }
    }
}
