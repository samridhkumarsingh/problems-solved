class Solution {
    public boolean isPossible(int[] nums,int mid,int oper)
    {long x=0;
        for(int i:nums)
        {
            // if(i>mid)
            // {
            //     // if(i%mid==0)
            //     // {
            //     //      x+=(i/mid)-1;
            //     // }
            //     // else
            //     // {
            //     //      x+=(i/mid);
            //     // }
                
            // }
            x+=(i-1)/mid;
        }
        if(x<=oper) return true;
        else return false;

    }
    public int minimumSize(int[] nums, int maxOperations) {
        int n=nums.length;
        int lo=1,hi;
        int max=Integer.MIN_VALUE;
      
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,nums[i]);
          
        }
       
        hi=max;
        int no=hi;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
           if(isPossible(nums,mid,maxOperations))
           {
            no=mid;
            hi=mid-1;
           }
           else
           {
            lo=mid+1;
           }
        }
        
        return no;
    }
}