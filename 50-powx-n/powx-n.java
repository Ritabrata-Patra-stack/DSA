class Solution {
    public double myPow(double x, int n) {
        int N = 0;
        if(n<0)
        {
            N = -n;
            x = 1/x;
            return power(x,N);
        }
        return power(x,n);
    }
    public double power(double x, int n)
    {
        if(n == 0)
        return 1;

        double half = power(x,n/2);

        if(n%2 == 0)
        return half * half;
        else
        return half * half * x;
    }
}