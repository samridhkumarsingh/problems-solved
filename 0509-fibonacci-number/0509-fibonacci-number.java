class Solution {
    // public int fib(int n) {
    //     if(n<=1) return n;
    //     // if(n==1) return 1;
    //     // if(n==0) return 0;        
    //     return fib(n-1)+fib(n-2);
    // }

    public int fibo(int n,int[] dp)
    {
        if(n<=1) return n;

        if(dp[n]!=-1) return dp[n];
        int last=fib(n-1);
        int slast=fib(n-2);
        dp[n]=last+slast;
        return dp[n];
    }
    public int fib(int n)
    {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fibo(n,dp);
    }
}