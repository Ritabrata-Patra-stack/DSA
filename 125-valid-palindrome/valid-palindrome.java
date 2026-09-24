class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String a = "";
    for (char ch : s.toCharArray()) {
    if (Character.isLetterOrDigit(ch)) {
        a += ch;
    }
    }
        return pal(a,0,a.length()-1) == true? true:false;
    }
    private boolean pal(String s,  int start, int end)
    {
        if(start>=end)
        return true;
        else if(s.charAt(start) != s.charAt(end))
        return false;
        else
        return pal(s, start+1,end-1);
    }
}