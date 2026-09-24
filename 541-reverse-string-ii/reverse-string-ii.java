class Solution {
    public String reverseStr(String s, int k) {
        if(s.length() < k)
        {
            return rev(s);
        }
        if(s.length()<=2*k && s.length()>=k)
        {
            return rev(s.substring(0,k))+s.substring(k,s.length());
        }
        String a = "";
        for(int i  =0; i<s.length(); i = i+2*k)
        {
            int end = Math.min(i + k, s.length());
            a = a + rev(s.substring(i, end));
            if (end < s.length()) {
                int nextEnd = Math.min(i + 2 * k, s.length());

                a = a + s.substring(end, nextEnd);
            }
        }
        return a;
    }
    private String rev(String s)
    {
        String a = "";
        for(int i = s.length()-1; i>=0;i--)
        {
            a = a+ s.charAt(i);
        }
        return a;
    }
}