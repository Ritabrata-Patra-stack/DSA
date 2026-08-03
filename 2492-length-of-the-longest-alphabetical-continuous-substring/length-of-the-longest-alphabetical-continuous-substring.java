class Solution {
    public int longestContinuousSubstring(String s) {

        char[] ch = s.toCharArray();

        int max = 1;
        int cnt = 1;

        for (int i = 1; i < ch.length; i++) {

            if (ch[i] == ch[i - 1] + 1) {
                cnt++;
            } else {
                cnt = 1;
            }

            max = Math.max(max, cnt);
        }

        return max;
    }
}