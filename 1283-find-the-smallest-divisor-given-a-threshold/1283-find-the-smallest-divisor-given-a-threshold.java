class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=Integer.MIN_VALUE; //
        for(int i=0;i<n;i++)
        {
          max=  Math.max(max,nums[i]);
        }
        //  int d;                  //brute
        // for( d=1;d<max;d++)
        // {
        //     int sum=0;
        //     for(int j=0;j<n;j++)
        //     {
        //         if(nums[j]%d==0) sum+=nums[j]/d;
        //         else sum+=nums[j]/d +1;
        //     }
        //     if(sum<=threshold) return d;
        // }
        // return d;
        int minMid=Integer.MAX_VALUE;
        int lo=1,hi=max;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
             int sum=0;
            for(int j=0;j<n;j++)
            {
                if(nums[j]%mid==0) sum+=nums[j]/mid;
                else sum+=nums[j]/mid +1;
            }
            if(sum<=threshold)
            {
                minMid=Math.min(minMid,mid);
                hi=mid-1;
            } 
            else if(sum>threshold) lo=mid+1;
        }
        return minMid;
    }
}