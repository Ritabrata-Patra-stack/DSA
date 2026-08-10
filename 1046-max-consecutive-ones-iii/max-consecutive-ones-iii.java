class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, a = 0, max = 0;

        for (int r = 0; r < nums.length; r++) {

            if (nums[r] == 0) {
                a++;
            }

            while (a > k) {
                if (nums[l] == 0) {
                    a--;
                }
                l++;
            }

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}