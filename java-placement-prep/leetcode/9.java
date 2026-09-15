/*9. Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
*/
class Solution {
    public boolean isPalindrome(int x) {
        boolean result=false;
        int num=x;
        int rev=0;
        while(num>0){
            int digi=num%10;
            rev=rev*10+digi;
            num=num/10;
        }
        return (x==rev)? true:false;
    }
}
