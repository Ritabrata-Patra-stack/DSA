class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq = 0;
        int [] freq = new int[26];
        char [] letters = s.toCharArray();
        int maxlen = 0;
        int l = 0;
        for(int r = 0; r<s.length(); r++)
        {
            freq[letters[r] - 'A']++;

            maxfreq = Math.max(maxfreq,freq[letters[r] - 'A']);
            while((r-l+1)-maxfreq > k)
            {
                freq[letters[l] - 'A']--;
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;

    }
}