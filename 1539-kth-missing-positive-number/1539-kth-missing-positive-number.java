class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int ans=0;
        int a=0;
        for(int i=0;i<n;i++)
        {
           if(arr[i]-(i+1)!=0)
           {
            a=arr[i]-(i+1);
            if(a>=k)
            {
                if(i==0) return ans+k;
                else
                {
                    int b=k-(arr[i-1]-i);
                    ans=arr[i-1]+b;
                    return ans;
                }
                
            }
           }
        }
        return arr[n-1]+(k-a);
        
    }
}