class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0;
        int n=nums.length;
        int sum=0;
        int c=0;
        int cut=Integer.MAX_VALUE;
        while(right<n)
        {
            sum+=nums[right];
            right++;
            while(sum>=target)
            {
                c=right-left;
                cut=Math.min(cut,c);
                sum-=nums[left];
                left++;
            }
            
        }
        if(cut==Integer.MAX_VALUE) return 0;
        return cut;
    }
}