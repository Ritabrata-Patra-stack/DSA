class Solution {
    public List<List<Integer>> permute(int[] nums) {
    //    List<List<Integer>> result = new ArrayList<>();
    //    ans(result, new ArrayList<>(), nums);
    //    return result;
    //}
    //private void ans(List<List<Integer>> result, List<Integer> temp , int[] nums)
    //{
    //    if(temp.size() == nums.length)
    //    {
    //        result.add(new ArrayList<>(temp));
    //        return;
    //    }
    //    for(int n : nums)
    //    {
    //        if(temp.contains(n))
    //        continue;
    //        temp.add(n);
    //        ans(result,temp,nums);
    //        temp.remove(temp.size()-1);
    //    }
    //}
    List<List<Integer>> result = new ArrayList<>();
    ans(result,nums,0);
    return result;
    }
    private void swap(int [] nums,int j,int index)
    {
        int temp = nums[index];
        nums[index] = nums[j];
        nums[j] = temp;
    }
    private void ans(List<List<Integer>> result, int [] nums,int index)
    {
        if(nums.length == index)
        {
            ArrayList<Integer> a = new ArrayList<>();
            for(int n : nums)
            {
                a.add(n);
            }
            result.add(a);
        }
        for(int i = index; i<nums.length;i++)
        {
            swap(nums,i,index);

            ans(result,nums, index+1);

            swap(nums,i,index);

        }
    }
}