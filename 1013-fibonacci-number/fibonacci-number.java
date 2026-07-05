class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;
        if(n==1)
            return 1;
        else if(n==0)
            return 0;
        else
        {
        for(int i = 1; i<n;i++)
        {
            sum = (a+b);
            a = b;
            b = sum;

        }
        return sum;
        }
    }
}