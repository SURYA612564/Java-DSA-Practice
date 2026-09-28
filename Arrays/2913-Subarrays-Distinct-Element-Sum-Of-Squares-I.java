// Problem Number: 2913
// Problem Name: Subarrays Distinct Element Sum of Squares I
// Topic: Array
// Time Complexity: O(n³)
// Space Complexity: O(n)

class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    map.put(nums.get(k),map.getOrDefault(nums.get(k),0)+1);
                }
                sum+=(map.size()*map.size());
                map.clear();
            }
        }
        return sum;
    }
}