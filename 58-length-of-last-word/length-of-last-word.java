class Solution {
    public int lengthOfLastWord(String s) {
        String a = s.trim();
        for(int i= a.length()-1; i>0; i--)
        {
            if(a.charAt(i) == ' ')
            {
                int b = a.length()-(i+1);
                return b;
            }
        }
        return a.length();
    }
}