class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
    }
    public int atmost(int [] nums, int k)
    {
        int l = 0,count = 0,sum = 0;
        for(int r = 0; r<nums.length;r++)
        {
            if(nums[r] % 2 != 0)
            sum++;

            while(sum>k)
            {
                if(nums[l] % 2 != 0)
                {
                    sum--;
                }
                l++;
            }
            count  = count + r-l+1;
        }
        return count;
    }
}