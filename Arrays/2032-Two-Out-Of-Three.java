// Problem Number: 2032
// Problem Name: Two Out of Three
// Difficulty: Easy
// Topic: Array
// Problem Link: https://leetcode.com/problems/two-out-of-three/
// Time Complexity: O(n³)
// Space Complexity: O(n)

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        HashSet<Integer>set3=new HashSet<>();
        for(int x : nums1)set1.add(x);
        for(int x : nums2)set2.add(x);
        for(int x : nums3)set3.add(x);
        List<Integer>list=new ArrayList<>();
        HashSet<Integer>ans=new HashSet<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(set1.contains(nums2[i]))
            {
                ans.add(nums2[i]);
            }
        }
        for(int i=0;i<nums3.length;i++)
        {
            if(set1.contains(nums3[i]))
            {

                ans.add(nums3[i]);
            }
        }
        for(int i=0;i<nums3.length;i++)
        {
            if(set2.contains(nums3[i]))
            {
             ans.add(nums3[i]);
            }
        }
        for(int y : ans)list.add(y);
        return list;
    }
}