class Solution {
    public int longestContinuousSubstring(String s) {
        if(s.length() == 1)
        {
            return 1;
        }
        char[] ch = s.toCharArray();
        int c =1, max = 1;
        for(int i = 1; i<ch.length; i++)
        {
            if(ch[i]-'a'-1 == ch[i-1]-'a')
            {
                c++;
            
            max  = Math.max(c,max);
            }
            else
            {
                c =1;
            }
        }
        return max;
    }
}