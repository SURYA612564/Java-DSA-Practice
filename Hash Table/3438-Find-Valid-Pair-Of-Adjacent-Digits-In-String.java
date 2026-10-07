// Problem Number: 3438
// Problem Name: Find Valid Pair of Adjacent Digits in String
// Topic: Hash Table
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution {
    public String findValidPair(String s) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(char c : s.toCharArray())
        {
            int n=c-'0';
            map.put(n,map.getOrDefault(n,0)+1);
        }
        String ans="";
         for(int i=0,j=i+1;i<s.length() && j<s.length();i++,j++)
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                  int x=s.charAt(i)-'0';
                  int y=s.charAt(j)-'0';
                  if(map.get(x)==x && map.get(y)==y)
                  {
                    ans+=s.charAt(i);
                    ans+=s.charAt(j);
                    return ans;
                  }
            }
        }
        return ans;
    }
}