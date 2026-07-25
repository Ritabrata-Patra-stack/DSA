class Solution {
    public int maxProduct(int n) {
     List<Integer> nums = new ArrayList<>();
     while(n!=0)
     {
        nums.add(n%10);
        n = n/10;

     } 
     int max = 0, a = 0, p=0;
     for(int i = 0; i<nums.size(); i++){
        for(int j  = a; j<nums.size(); j++)
        {
            if(i != j){
             p = nums.get(i) * nums.get(j);
            }
            if(p>max)
            {
                max = p;
            }
        }
        a = a+1;
     } 
     return max;
    }
    
}