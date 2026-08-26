class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l =0,a = 0,min =Integer.MAX_VALUE,r=0,x =0,mins =0;
       for(r = 0; r<s.length(); r++)
       {
            if(s.charAt(r) == '1' )
            {
                a++;
            }
            while(a > k)
            {
                
                if(s.charAt(l) == '1')
                {
                    a--;
                }
                l++;
            }
            if(s.charAt(r) == '0')
            {
                x++;
                if(x == s.length())
                {
                    return "";
                }
            }
            if(a==k)
            {
                while(s.charAt(l) == '0')
                {
                l++;
                }
               if (r - l + 1 < min || (r - l + 1 == min && s.substring(l, r + 1).compareTo(s.substring(mins, mins + min)) < 0))
                {
                    min = r - l + 1;
                     mins = l;
                }
            }
       }
       if(a<k)
       {
        return "";
       }
       return s.substring(mins,min+mins);  
    }
}