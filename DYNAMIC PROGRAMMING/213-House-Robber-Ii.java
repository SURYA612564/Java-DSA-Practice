// Problem Number: 213
// Problem Name: House Robber II
// Topic: Dynamic Programming
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution {
    public int rob(int[] nums) {
        if(nums.length<=1)return nums[0];
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        int dp1[]=new int[nums.length];
        dp1[0]=0;
        dp1[1]=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            dp1[i]=Math.max(dp1[i-1],dp1[i-2]+nums[i]);
        }
        return Math.max(dp[nums.length-2],dp1[nums.length-1]);

    }
}