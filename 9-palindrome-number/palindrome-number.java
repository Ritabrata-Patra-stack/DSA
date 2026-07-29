class Solution {
    public boolean isPalindrome(int x) {
        int cpy = x, rev =0;
        while(cpy != 0)
        {
            rev = 10 * rev+(cpy%10);
            cpy = cpy/10;
        }
        if(rev == x && x>=0)
        {
            return true;
        }
        return false;
    }
}