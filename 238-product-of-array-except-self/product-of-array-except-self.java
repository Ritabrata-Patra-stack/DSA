class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = 1,r=1;
        int [] answer = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            answer[i] = l;
            l = l*nums[i];
        }
        for(int i = nums.length-1; i>=0; i--)
        {
            answer[i] =answer[i] * r;
            r = r*nums[i];
        }
        return answer;
    }
}