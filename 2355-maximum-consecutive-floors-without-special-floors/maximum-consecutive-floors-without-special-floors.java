class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
       Arrays.sort(special);
       int ans = 0;
       for(int i=0; i<special.length;i++)
       {
            if(i==0)
                ans = special[0] - bottom;
            else
                ans = Math.max(ans, special[i]-special[i-1]-1);           
       }
       ans = Math.max(ans,top-special[special.length -1]);
       return ans;    

    }
}