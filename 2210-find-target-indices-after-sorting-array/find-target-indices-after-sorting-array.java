class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      int a = 0;
      int b = 0;
      for(int i : nums)
      {
        if(i<target)
        a++;
        if(i == target)
        b++;
      }
      ArrayList<Integer> list = new ArrayList<>();
      for(int i = 0;i<b;i++)
      {
        list.add(a+i);
      }
      return list;
    }
}