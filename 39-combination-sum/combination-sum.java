class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        solve(result,new ArrayList<Integer>(),candidates,target,0);
        return result;
    }
    private void solve(List<List<Integer>>result,List<Integer> temp ,int[] c, int t,int index)
    {
        if(t == 0)
        {
            result.add(new ArrayList(temp));
            return;
        }
        if(index == c.length)
        {
            return;
        }
        if(c[index]>t)
        {
            return;
        }
        
        //pick
        temp.add(c[index]);
        solve(result,temp,c,t-c[index],index);
        
        //not pick
        temp.remove(temp.size()-1);
        solve(result,temp,c,t,index+1);
        
    }
}