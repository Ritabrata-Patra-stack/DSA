class Solution {
    public int missingMultiple(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i = 0; i<nums.length;i++)
      {
        map.put(nums[i],i);
      }
      int a = k;
      while(map.containsKey(a))
      {
        a = a+k;
      }
      return a;
    }
}