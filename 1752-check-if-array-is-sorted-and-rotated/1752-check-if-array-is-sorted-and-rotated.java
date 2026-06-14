class Solution {
    public boolean check(int[] nums) {
        int c=0;
        int n=nums.length-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]-nums[i+1]>0)
            {
                c++;
            }
        }
        if(nums[n]-nums[0]>0) c++;

        // if(c<2) return true;
        // return false;

        return c<2;
    }
}