class Solution {
    public boolean isPossible(int[] arr,int mid,int h)
    {
        int n=arr.length;
        long m=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%mid!=0) m+=(arr[i]/mid)+1;
            else m+=(arr[i]/mid);
        }
        if(m<=h) return true;
        else return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int hi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            hi=Math.max(hi,piles[i]);
        }
        int lo=1;
        int min=0;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(isPossible(piles,mid,h))
            {
                min=mid;
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }
        }
        return min;
    }
}