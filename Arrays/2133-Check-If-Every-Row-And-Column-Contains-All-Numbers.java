// Problem Number: 2133
// Problem Name: Check if Every Row and Column Contains All Numbers
// Topic: Array
// Time Complexity: O(n³)
// Space Complexity: O(n²)

class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            Set<Integer>set=new HashSet<>();
            for(int j=0;j<n;j++)
            {
                set.add(matrix[i][j]);
            }
            if(set.size()!=n)return false;
            set.clear();
        }
        for(int i=0;i<n;i++)
        {
            Set<Integer>set=new HashSet<>();
            for(int j=0;j<n;j++)
            {
               set.add(matrix[j][i]);
            }
            if(set.size()!=n)return false;
        }
        return true;
    }
}