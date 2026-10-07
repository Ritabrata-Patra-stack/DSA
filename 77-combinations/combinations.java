class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        solve(result,n,k,new ArrayList<>());
        return result;
    }
    private void solve(List<List<Integer>> result, int n, int k, List<Integer> temp)
    {
        if(k==0)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        if(n==0)
        {
            return;
        }
        //pick
        temp.add(n);
        solve(result,n-1,k-1,temp);
        //not pick
        temp.remove(temp.size()-1);
        solve(result,n-1,k,temp);
    }
}