// Problem Number: 1935
// Problem Name: Maximum Number of Words You Can Type
// Topic: String
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[]parts=text.split(" ");
        int valid=0;
        for(int i=0;i<parts.length;i++)
        {
            boolean count=false;
            for(int j=0;j<brokenLetters.length();j++)
            {
                String currentChar = String.valueOf(brokenLetters.charAt(j));
                if(parts[i].contains(currentChar))count = true;
            }
            if(!count)valid++;
        }
        return valid;
    }
}