class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int n = arr.length; //method 1

        // for (int i = 0; i < n; i++) {
        //     int missing = arr[i] - (i + 1);

        //     if (missing >= k) {
        //         if (i == 0) {
        //             return k;
        //         } else {
        //             int prevMissing = arr[i - 1] - i;
        //             return arr[i - 1] + (k - prevMissing);
        //         }
        //     }
        // }

        // // if kth missing is beyond last element
        // int totalMissing = arr[n - 1] - n;
        // return arr[n - 1] + (k - totalMissing);
    

    //  for(int num : arr){ //method 2
    //  if(num <= k) k++;
    //  else break;
    // }

    // return k;

    //method 3

    int n= arr.length;
    int lo=0,hi=n-1;
    int missed=0;
    while(lo<=hi)
    {
        int mid=lo+(hi-lo)/2;
        missed= arr[mid]-(mid+1);
        if(missed<k) lo=mid+1;
        else hi=mid-1;
    }
    
    // missed=arr[hi]-(hi+1);
    // return arr[hi] +(k-missed);
        return k+(hi+1); //k+(low)

    }
}