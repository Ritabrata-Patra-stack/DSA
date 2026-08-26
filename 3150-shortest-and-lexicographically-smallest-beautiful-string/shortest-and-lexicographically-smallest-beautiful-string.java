class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l =0,a = 0;
        String ans = "";
        for(int r = 0; r < s.length(); r++)
        {
            if(s.charAt(r) == '1')
            {
                a++;
            }
            while(a>k)
            {
                if(s.charAt(l)=='1')
                {
                    a--;
                }
                l++;
            }
            if(a == k)
            {
                while(s.charAt(l) == '0')
                {
                    l++;
                }
                String c = s.substring(l,r+1);
                if(ans.equals("") || c.length() < ans.length() || (ans.length() == c.length() && c.compareTo(ans) <0))
                {
                    ans = c;
                }
            }
        }

        return ans;
    }   
}