class Solution {
    public int numIdenticalPairs(int[] nums) {
        int a = 1,c=0;
        for(int i = 0; i<nums.length; i++)
        {
            for(int j= a; j<nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    c++;
                }
            }
            a++;
        }
        return c;
    }
}