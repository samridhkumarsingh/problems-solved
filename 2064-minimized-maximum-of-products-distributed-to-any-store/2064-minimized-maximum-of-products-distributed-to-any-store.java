class Solution {
    public boolean isPossible(int n,int[] quant,int mid)
    {
        int stores=0;
        for(int i=0;i<quant.length;i++)
        {
            if((quant[i]%mid)==0) stores+=(quant[i]/mid);
            else stores+=(quant[i]/mid)+1;
        }

        if(stores<=n) return true;
        else return false;
    }
    public int minimizedMaximum(int n, int[] quantities) {
       int m=quantities.length;
       int maxele=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            maxele=Math.max(quantities[i],maxele);
        }
        int lo=1,hi=maxele;
        int min=0;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(isPossible(n,quantities,mid)==true)
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