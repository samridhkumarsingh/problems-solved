class Solution {
    public boolean check(int[] nums) {
    //    int smll=Integer.MAX_VALUE;   //wrong approach
    //    int indx=0;
    //    int n=nums.length;
    //    for(int i=0;i<n;i++) 
    //    {
    //     if(nums[i]<smll)
    //     {
    //         smll=nums[i];
    //         indx=i;
    //     }
    //    }
        
    //     for(int i=indx;i<n-1;i++)
    //     {
    //         if(nums[i]>nums[i+1]) return false;
    //     }
    //    if(indx==0) return true;
    //     if(nums[n-1]>nums[0]) return false;
    //     for(int i=0;i<indx-1;i++)
    //     {
    //          if(nums[i]>nums[i+1]) return false;
    //     }

    //     return true;

    int count=0;
    int n=nums.length;
    for(int i=0;i<n-1;i++)
    {
        if(nums[i]>nums[i+1]) count++;
    }

    if(nums[0]<nums[n-1]) count++;

    return count<=1;
    }
}