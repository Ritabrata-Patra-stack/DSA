class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ans(result, new ArrayList<>(), nums);
        return result;
    }
    private void ans(List<List<Integer>> result, List<Integer> temp , int[] nums)
    {
        if(temp.size() == nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int n : nums)
        {
            if(temp.contains(n))
            continue;
            temp.add(n);
            ans(result,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}