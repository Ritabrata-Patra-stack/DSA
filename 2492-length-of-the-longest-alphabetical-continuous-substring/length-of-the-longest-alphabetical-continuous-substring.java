class Solution {
    public int longestContinuousSubstring(String s) {
        int c= 1, max = 0;
        if(s.length() == 1)
        {
            return 1;
        }
        for(int i = 1; i<s.length(); i++)
        {
            
            if(s.charAt(i-1)+1 == s.charAt(i))
            {
                c++;
            }
            if(c>max)
            {
                max = c;
            }
            if(s.charAt(i-1)+1 != s.charAt(i))
            {
                c = 1;
            }
        }
        return max;
    }
}