class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int lo=0,hi=n-1;
         int mid=0;
        while(lo<=hi)
        {
             mid=lo+(hi-lo)/2;
            if((mid>0 && arr[mid-1]<arr[mid])&&(mid+1<n &&arr[mid]>arr[mid+1]))
            {
                return mid;
            }
            else if(mid>0 && arr[mid-1]>arr[mid]) hi=mid-1;
             else lo=mid+1;
        }
        return mid;
    }
}