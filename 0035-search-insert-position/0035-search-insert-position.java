class Solution {
    public int searchInsert(int[] nums, int target) {
        // int n=nums.length;//normal loop ;//next time try binary search
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]>=target)
        //     {
        //         return i;
        //     }
        // }
        // return n;

        int l=0,h=nums.length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2; 
            if(nums[mid]==target) return mid;
           else if(nums[mid]<target)
                {
                    l=mid+1;
                }
            else h=mid-1;
        }
      return l;
    }
}