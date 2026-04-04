class Solution {
    public int mxrb(int indx,int[] nums,int[] dp)
    {
        if(indx>=nums.length) return 0;
        if(dp[indx]!=-1) return dp[indx];
        int rob=nums[indx]+mxrb(indx+2,nums,dp);
        int skip=mxrb(indx+1,nums,dp);
        dp[indx]=Math.max(rob,skip);
        return dp[indx];

    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return mxrb(0,nums,dp);
    }
}