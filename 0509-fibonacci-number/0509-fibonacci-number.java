class Solution {
    public int fibo(int n,int[] dp)
    {
        if(n<=1) return n;

        if(dp[n]!=-1) return dp[n];
        int last=fibo(n-1,dp);
        int slast=fibo(n-2,dp);
        dp[n]=last+slast;
        return dp[n];
    }

    public int fib(int n) {
        // if(n<=1) return n;
        // int last=fib(n-1);
        // int slast=fib(n-2);
        // return last+slast;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fibo(n,dp);
    }
}