class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0,  r =0, max = 0;
        HashSet<Character> set = new HashSet<>();
        while(l < s.length())
        {
            if(r == s.length())
            {
                break;
            }
                if(!set.contains(s.charAt(r)))
                {
                    set.add(s.charAt(r));
                    max = Math.max(max,r-l+1);
                     r++;
                }
                else
                {
                    set.remove(s.charAt(l));
                    l++;
                    
                }
                
                
            }
            
             return max;
        }
    
}
