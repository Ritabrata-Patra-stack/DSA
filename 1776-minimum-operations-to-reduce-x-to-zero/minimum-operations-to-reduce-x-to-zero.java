class Solution {
    public int minOperations(int[] nums, int x) {
        int target = -x;
        for(int i : nums) 
        target+=i;
        if(target == 0)
        return nums.length;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int res = -1;
        for(int i = 0; i<nums.length;i++)
        {
            sum += nums[i];
            if(map.containsKey(sum-target))
            {
                res = Math.max(res,i-map.get(sum-target));
            }
            map.put(sum,i);
        }
        if(res == -1)
        {
            return -1;
        }
        else
        {
            return nums.length-res;
        }
    }
}