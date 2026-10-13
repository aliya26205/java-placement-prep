/*3727. Maximum Alternating Sum of Squares
You are given an integer array nums. You may rearrange the elements in any order.
The alternating score of an array arr is defined as:
score = arr[0]2 - arr[1]2 + arr[2]2 - arr[3]2 + ...
Return an integer denoting the maximum possible alternating score of nums after rearranging its elements.
  Example 1:
Input: nums = [1,2,3]
Output: 12
Explanation:
A possible rearrangement for nums is [2,1,3], which gives the maximum alternating score among all possible rearrangements.
The alternating score is calculated as:
score = 22 - 12 + 32 = 4 - 1 + 9 = 12*/
//1st try:-
class Solution {
    public long maxAlternatingSum(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length / 2;
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            long square = (long) nums[i] * nums[i];
            if (i >= mid) {
                result = result + square;
            } else {
                result = result - square;
            }

        }
        return result;
    }
}
//2nd try:-
class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int mid = nums.length / 2;
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= mid) {
                result = result + nums[i];
            } else {
                result = result - nums[i];
            }

        }
        return result;
    }
}
