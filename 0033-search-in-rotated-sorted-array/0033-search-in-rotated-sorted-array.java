class Solution {
    public int bs(int[] nums,int target,int lo, int hi)
    {
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) hi=mid-1;
            else lo=mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
       //find pivot
        int n=nums.length;
        if(n<=2)
        {
            for(int i=0;i<n;i++)
            {
                if(nums[i]==target) return i;
            }
            return -1;
        }
        int low=1,high=n-2;
        int pindx=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if((nums[mid]>nums[mid+1])&& (nums[mid]>nums[mid-1]))
            {
                pindx= mid;
                break;
            } 
            else if((nums[mid]<nums[mid+1])&& (nums[mid]<nums[mid-1]))
            {
                pindx=mid-1;
                break;
            }
            else if((nums[mid]<nums[mid+1])&& (nums[mid]>nums[mid-1]))
            {
                if(nums[mid]>nums[n-1]) low=mid+1;
                else high=mid-1;
            }
        }
        if(pindx==-1){//array is not rotated
            return bs(nums,target,0,n-1);        
        }
        int left=bs(nums,target,0,pindx);
        if(left!=-1) return left;
        int right= bs(nums,target,pindx+1,n-1);
        return right;
    }
}