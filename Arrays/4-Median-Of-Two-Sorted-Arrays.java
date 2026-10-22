// Problem Number: 4
// Problem Name: Median of Two Sorted Arrays
// Difficulty: Hard
// Topic: Array, Binary Search, Divide and Conquer
// Problem Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            arr[k]=nums1[i];
            k++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            arr[k]=nums2[i];
            k++;
        }
        Arrays.sort(arr);
        int x=arr.length;
        double y=0.0;
        if(x%2!=0)
        {
         y=(arr[x/2]);
        }
        else
        {
            y=(arr[x/2-1]+arr[x/2])/2.0;
        }
        return y;
    }
}