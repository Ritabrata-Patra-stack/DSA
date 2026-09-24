class Solution {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            if(i == sumd(nums[i]))
            {
                min = Math.min(min,i);
            }
        }
        return min != Integer.MAX_VALUE? min : -1;
    }
    private int sumd(int a)
    { 
            int sum = 0;
            while(a>0)
            {
            sum += a%10;
            a/=10;
            }
        
        return sum;
    }
}