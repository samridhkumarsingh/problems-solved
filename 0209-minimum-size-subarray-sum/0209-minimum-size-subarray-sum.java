class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlength=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        for(int rg=0;rg<nums.length;rg++)
        {
            sum+=nums[rg];
           while(sum>=target)
            {
                minlength=Math.min(minlength,rg-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(minlength==Integer.MAX_VALUE) return 0;
        return minlength;
    }
}