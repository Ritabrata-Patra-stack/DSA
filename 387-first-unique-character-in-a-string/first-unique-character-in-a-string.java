class Solution {
    public int firstUniqChar(String s) {
        //int [] arr = new int[26];
        //for(int i = 0; i<s.length(); i++)
        //{
        //    if(arr[s.charAt(i) - 'a'] == 0)
        //    {
        //    for(int j = i+1; j<s.length();j++)
        //    {
        //        if(s.charAt(i) == s.charAt(j))
        //        {
        //        arr[s.charAt(i) - 'a']++;
        //        break;
        //        }
        //    }
        //    if(arr[s.charAt(i) - 'a'] == 0)
        //    {
        //        return i;
        //    }
        //    }
        //    else
        //    {
        //        continue;
        //    }
        //}
        //return -1;

        int []freq = new int[26];
        for(int i = 0; i<s.length();i++)
        {
            if(freq[s.charAt(i) - 'a'] <= 1)
            {
                freq[s.charAt(i) - 'a']++;
            }
            else
            {
                continue;
            }
        }
        for(int i = 0; i<s.length();i++)
        {
            if(freq[s.charAt(i) - 'a'] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}