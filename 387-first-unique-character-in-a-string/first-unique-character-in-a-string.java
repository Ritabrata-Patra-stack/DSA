class Solution {
    public int firstUniqChar(String s) {
        int [] arr = new int[26];
        for(int i = 0; i<s.length(); i++)
        {
            for(int j = i+1; j<s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                arr[s.charAt(i) - 'a']++;
                break;
                }
            }
            if(arr[s.charAt(i) - 'a'] == 0)
            {
                return i;
            }
        }
        return -1;
    }
}