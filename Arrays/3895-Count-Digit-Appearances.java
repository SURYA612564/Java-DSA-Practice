// Problem Number: 3895
// Problem Name: Count Digit Appearances
// Topic: Array
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int x : nums)
        {
            while(x>0)
            {
                int rem=x%10;
                if(rem==digit)c++;
                x/=10;
            }
        }
        return c;
    }
}