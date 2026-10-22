// Problem Number: 26
// Problem Name: Remove Duplicates from Sorted Array
// Difficulty: Easy
// Topic: Array, Two Pointers
// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Time Complexity: O(n³)
// Space Complexity: O(n)

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>set=new LinkedHashSet<>();
        for(int x:nums)
        {
            set.add(x);
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=0;
        }
        int k=0;
        for(int y: set)
        {

            nums[k]=y;
            k++;
        }
        return set.size();
    }
}