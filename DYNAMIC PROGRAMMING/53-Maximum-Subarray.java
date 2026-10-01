// Problem Number: 53
// Problem Name: Maximum Subarray
// Topic: Dynamic Programming
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
       if(nums.length<=1)return nums[0];
       int current=nums[0];
       int max=nums[0];
       for(int i=1;i<nums.length;i++)
       {
         current=Math.max(nums[i],current+nums[i]);
         max=Math.max(max,current);
       }
       return max;
    }
}