class Solution {
    //   public int climbStairs(int n) {
    //     if(n<=2) return n;
    //     return climbStairs(n-1)+climbStairs(n-2);

    //   }
    public int cum(int n,int[] dp)
    {
        if(n==0) return 1;
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        dp[n]=cum(n-1,dp)+cum(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i]=-1;
        }

        return cum(n,dp);
        
    }
}