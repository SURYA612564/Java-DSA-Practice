// Problem Number: 1475
// Problem Name: Final Prices With a Special Discount in a Shop
// Topic: Array
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]=new int[prices.length];
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[i]>=prices[j])
                {
                    ans[i]=prices[i]-prices[j];
                    break;
                }
                    ans[i]=prices[i];
            }
            ans[prices.length-1]=prices[prices.length-1];
        }
        return ans;
    }
}