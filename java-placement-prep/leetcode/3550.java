/*3550. Smallest Index With Digit Sum Equal to Index
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given an integer array nums.
Return the smallest index i such that the sum of the digits of nums[i] is equal to i.
If no such index exists, return -1.
Example 1:
Input: nums = [1,3,2]
Output: 2
Explanation:
For nums[2] = 2, the sum of digits is 2, which is equal to index i = 2. Thus, the output is 2.*/
class Solution {
    public int smallestIndex(int[] nums) {
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            while (nums[i] > 0) {
                int digi = nums[i] % 10;
                sum = sum + digi;
                nums[i]=nums[i]/10;
            }
            if(sum==i){
                return i;
            }

        }
        return result;
    }
}
