/*189. Rotate Array
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]*/
/*Method-1
take full array thn reverse it
reverse 1st part of reversed array till k-1
reverse 2nd part of reversed array from k to n-1
eg:
1 2 3 4 5 6 7
7 6 5 4 3 2 1
7 6 5   4 3 2 1
5 6 7   1 2 3 4*/
class Solution {
    public void rev(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start=start+1;
            end=end-1;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k%n==0){
            return;
        }
        k=k%n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }
}
/*method-2
array:-
0 1 2 3 4 5 6 
1 2 3 4 5 6 7
      1(k=3)
            4
index=0
curr=1;
next=4
arr[(index+k)%n)=curr
curr=next
index=(index+K)%n =3
*/
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;count<n;i++){
            int index=i;
            int current=nums[index];
            do{
                int next=nums[(index+k)%n];
                nums[(index+k)%n]=current;
                current=next;
                index=(index+k)%n;
                count=count+1;
            }while(index!=i);
        }
    }
}
