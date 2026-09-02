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
/*method 1:
sort and thn compare 1st and 2nd element 
muns[i]==nums[i+1]
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                result=true;
            }
        }
        return result;
    }
}
/*method 2 :
use hashset 
put elemets in hash set before putting check if its already there */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result=false;
        Set<Integer> set=new HashSet<>();

        for(int num:nums){
            if(set.contains(num))
               result=true;
            set.add(num);
        }
        return result;
    }
}
