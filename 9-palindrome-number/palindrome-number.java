class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int cpy = x, rev =0;
        if(s.charAt(0) == s.charAt(s.length()-1))
        {
        while(cpy != 0)
        {
            rev = 10 * rev+(cpy%10);
            cpy = cpy/10;
        }
        }
        else
        {
            return false;
        }
        if(rev == x && x>=0)
        {
            return true;
        }
        return false;
    }
}