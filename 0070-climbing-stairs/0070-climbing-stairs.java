class Solution {
    public int climbStairs(int n) {
        // if(n<=2) return n;
        // return climbStairs(n-1)+climbStairs(n-2);
       int[] dp=new int[n+1];
       for(int i=0;i<n+1;i++)
       {
        dp[i]=-1;
       }
       return stairs(n,dp);

    }
    int stairs(int n,int[] dp)
    {
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        dp[n]=stairs(n-1,dp)+stairs(n-2,dp);
        return dp[n];
    }
}