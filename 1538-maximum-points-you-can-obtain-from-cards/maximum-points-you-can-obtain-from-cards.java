class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int rsum = 0, lsum = 0,max = 0;
        for(int i = 0; i<=k-1;i++)
        {
            lsum = lsum + cardPoints[i];
            max = lsum;
        }
        int a = cardPoints.length-1;
        for(int i = k-1; i>=0; i--)
        {
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[a];
            max = Math.max(max,lsum+rsum);
            a--;
        }
       
       return max;
    }
}