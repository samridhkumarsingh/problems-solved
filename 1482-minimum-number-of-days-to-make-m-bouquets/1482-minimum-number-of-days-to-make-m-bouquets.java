class Solution {
    public boolean isPossible(int[] arr,int m ,int k,int mid)
    {
        long x=0,y=0;
        for(int ele:arr)
        {
            if(ele<=mid){
                 y++;
              if(y==k)
              {
                  x++;
                 y=0;
             }
            }
           
            else y=0;
        }
        
        if(x>=m) return true;
        else return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<(long)m*k) return -1;
        int lo=Integer.MAX_VALUE,hi=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            hi=Math.max(hi,bloomDay[i]);
            lo=Math.min(lo,bloomDay[i]);
        }
        while(lo<=hi)
        {
            int mid= lo+(hi-lo)/2;
            if(isPossible(bloomDay,m,k,mid))
            {
                ans=mid;
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }
        }
        return ans;
    }
}