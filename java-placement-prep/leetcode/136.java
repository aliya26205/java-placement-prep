/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1
my solution:-*/
class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])
                  count++;
            }
            if(count==1){
                return nums[i];
            }
        }
        return 0;
    }
}
/* Method 1:
using maps*/
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num :nums){
            if(!map.containsKey(num)){
                map.put(num,0);
            }
            map.put(num,map.get(num)+1);
        }
    
    for(int num :nums){
        if(map.get(num)==1){
            return num;
        }
    }
    return 0;
    }
}
