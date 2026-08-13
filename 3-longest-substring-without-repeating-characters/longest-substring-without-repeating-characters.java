class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<>();
        int l= 0, max =0;
        for(int r = 0; r<s.length(); r++)
        {
            char ch = s.charAt(r);

            while (map.contains(ch)) {
                map.remove(s.charAt(l));
                l++;
            }

            map.add(ch);

            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}