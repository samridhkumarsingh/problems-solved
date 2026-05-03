class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int hi=n-1;
        int lo=0;
        if(n==1) return nums[0];
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(mid==0) // 1st position
            {
                if(nums[mid]!=nums[mid+1]) return nums[mid];
            }
            else if(mid==n-1)
            {
                 if(nums[mid]!=nums[mid-1]) return nums[mid];
            }
           else if((nums[mid]!=nums[mid-1])&&(nums[mid]!=nums[mid+1])) return nums[mid];
           else if(mid%2==0)
           {
            if(nums[mid]==nums[mid+1])//right side
            {
                lo=mid+1;
            }
            else
            {
                hi=mid-1;
            }
           }
           else
           {
             if(nums[mid]==nums[mid+1])//right side
            {
                 hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }
           }
        }
        return 0;
    }
}