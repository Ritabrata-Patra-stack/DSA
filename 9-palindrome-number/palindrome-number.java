class Solution {
    public boolean isPalindrome(int x) {
        int cpy = x, rev =0;
        if(x<0)
            return false;
        while(cpy != 0)
        {
            rev = 10 * rev+(cpy%10);
            cpy = cpy/10;
        }
        if(rev == x)
        {
            return true;
        }
        return false;
    }
}