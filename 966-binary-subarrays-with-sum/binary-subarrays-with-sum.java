class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        //int l = 0,sum = 0,a=0;
        //for(int i = 0;i<nums.length; i++)
        //{
        //    sum = 0;
        //    for(int j = i; j<nums.length; j++)
        //    {
        //        sum+= nums[j];
        //        if(sum == goal)
        //        {
        //            a++;
        //            
        //        }
        //    }
        //}
        //return a;
        return atmost(nums,goal) - atmost(nums,goal-1);
        
    }
    public int atmost(int [] nums,int goal)
    {
        if(goal<0)
        return 0;
        int l = 0,count = 0, sum = 0;
        for(int r = 0; r<nums.length; r++)
        {
            sum += nums[r];
            while(sum>goal)
            {
                sum = sum-nums[l];
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
}