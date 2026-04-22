class Solution {
    public boolean isPossible(int cap,int[] arr,int days)
    {
        int load=0,d=1;
        for(int i=0;i<arr.length;i++)
        {
            if(load+arr[i]<=cap)
            {
                load+=arr[i];
            }
            else
            {
                load=arr[i];
                d++;
            }
        }
        if(d>days) return false;
        else return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0,mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            mx=Math.max(weights[i],mx);
            sum+=weights[i];
        }

        int lo=mx,hi=sum,minc=sum;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(isPossible(mid,weights,days)==true)
            {
                minc=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return minc;
    }
}