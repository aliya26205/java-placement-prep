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
