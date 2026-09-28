// Problem Number: 3046
// Problem Name: Split the Array
// Topic: Array
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        if(nums.length<=2)return true;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)>=3)return false;
        }
        if(map.size()>=(nums.length/2))return true;
        else return false;
    }
}