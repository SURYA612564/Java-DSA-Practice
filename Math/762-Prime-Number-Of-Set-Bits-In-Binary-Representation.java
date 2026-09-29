// Problem Number: 762
// Problem Name: Prime Number of Set Bits in Binary Representation
// Topic: Math
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public boolean isPrime(int n)
    {
        if(n<=1)return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
       for(int i=left;i<=right;i++)
       {
        int c=Integer.bitCount(i);
        if(isPrime(c))count++;
       }
       return count;
    }
}