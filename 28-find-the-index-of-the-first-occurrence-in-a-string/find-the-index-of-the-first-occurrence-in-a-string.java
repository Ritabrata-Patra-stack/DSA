class Solution {
    public int strStr(String haystack, String needle) {
        int r = needle.length();
        int l = 0;
        for(int i = 0;i<haystack.length();i++)
        {
            if(r<=haystack.length() && haystack.substring(l,r).equals(needle))
            {
                return l;
            }
                l++;
                r++;
        }
        return -1;
    }
}