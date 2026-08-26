class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq = 0;
        int [] freq = new int[26];

        int maxlen = 0;
        int l = 0;
        for(int r = 0; r<s.length(); r++)
        {
            freq[s.charAt(r) - 'A']++;

            maxfreq = Math.max(maxfreq,freq[s.charAt(r) - 'A']);
            int window = r-l+1;
            if(window-maxfreq > k)
            {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            window = r-l+1;
            maxlen = Math.max(maxlen,window);
        }
        return maxlen;

    }
}