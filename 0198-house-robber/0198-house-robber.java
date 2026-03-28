class Solution {
  int MaxAm(int idx, int[] nums, int[] dp)
    {
        int n = nums.length;

        if(idx >= n)
        {
            return 0;
        }

        if(dp[idx] != -1)   // already calculated
        {
            return dp[idx];
        }

        int rob = nums[idx] + MaxAm(idx+2, nums, dp);
        int skip = MaxAm(idx+1, nums, dp);

        dp[idx] = Math.max(rob, skip);

        return dp[idx];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];

        Arrays.fill(dp,-1);

        return MaxAm(0, nums, dp);
    }
}