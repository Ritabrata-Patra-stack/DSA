class Solution {
    public int strStr(String haystack, String needle) {
        int r = needle.length();
        int l = 0;
        for(int i = 0;i<=haystack.length()-r;i++)
        {
            if(haystack.substring(i,i+r).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}