class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int s : nums)
        {
            int n = outer.size();
            for(int i = 0; i<n; i++)
            {
                List<Integer> internals = new ArrayList<>(outer.get(i));
                internals.add(s);
                outer.add(internals);
            }
        }
        return outer;
    }
}