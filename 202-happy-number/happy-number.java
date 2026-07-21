class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> ans = new HashSet<>();
        int x = n;
        for(int i = 1; i<=n;i++)
        {
            x = digit(x);
            if(ans.contains(x))
            {
                return false;
            }
            ans.add(x);
            
            if(x == 1)
            {
                return true;
            }
        }
        return false;
       
    }

    public static int digit(int n)
    {
        int cpy = n, sum = 0;
         while(cpy != 0)
        {
            int d = cpy%10;
            sum = sum + (d*d);
            cpy = cpy/10;

        }
        return sum;
    }
}