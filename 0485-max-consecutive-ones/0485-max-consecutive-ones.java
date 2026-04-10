class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int max=0;
        // int count=0;
        // int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]!=1)
        //     {
        //         max=Math.max(max,count);
        //         count=0;
        //     }
        //     else
        //     {
        //         count++;
        //     }
        // }
        // max=Math.max(max,count);

        // return max;

        int right=0,left=0;
        int n=nums.length;
        int c=0,max=0;
        while(right<n)
        {
            if(nums[right]==0)
            {
                c=right-left;
                max=Math.max(max,c);
                left=right+1;
            }
            right++;
        }
        c=right-left;
        max=Math.max(max,c);
        
        return max;
    }
}