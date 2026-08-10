class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int avg=0;
        int c=0;
        for(int r=0;r<arr.length;r++)
        {
            sum+=arr[r];
            if(r>=k-1)
            {
                avg=sum/k;
                if(avg>=threshold) c++;
                sum-=arr[r-k+1];
            }
        }
        return c;
    }
}