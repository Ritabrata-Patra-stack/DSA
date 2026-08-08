class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int tsum=0,min=0,j=0,i=0,sum=0;
        for(int num : cardPoints)
        {
            tsum = tsum + num;
        }
       while(j<cardPoints.length-k)
       {
            sum += cardPoints[j];
            j++;
       }
        min = sum;
        while(j<cardPoints.length)
        {
            sum += cardPoints[j];
            sum -= cardPoints[i];
            i++;
            j++; 
            min = Math.min(min,sum);
        }
        return tsum-min;

    }
}