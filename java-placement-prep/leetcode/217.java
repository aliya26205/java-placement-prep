/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
my solution compare all elements time exceed:-*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result=false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j]){
                    result=true;
                }
            }
        }
        return result;
    }
}
