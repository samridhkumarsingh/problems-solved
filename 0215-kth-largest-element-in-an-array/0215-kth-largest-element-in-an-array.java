class Solution {
    static int ans;
    public  void swap(int[] arr,int i,int j)
   {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
   }
    public  int partition(int[] arr,int lo,int hi)
    {
        //int mid=(lo+hi)/2;  //without taking 1st one we take middle one
        int mid = lo + (int)(Math.random() * (hi - lo + 1));
        int pivot=arr[mid];
        int pidx=mid;
        int smallercount=0;
        for(int i=lo;i<=hi;i++)
        {
            if(i==mid) continue; 
            if(arr[i]<=pivot) smallercount++;
        }
        int correctind=lo+smallercount;
        //swap arr[pidx] & arr[cidx]

       swap(arr,pidx,correctind);

       // partition
       int i=lo,j=hi;
       while(i<correctind && j>correctind)
       {
        if(arr[i]<=pivot) i++;
        else if(arr[j]>pivot) j--;
        else if(arr[i]>pivot && arr[j]<=pivot)
        {
            swap(arr,i,j);
        }
       }

       return correctind;
    }
    public  void quickSort(int[] arr,int lo,int hi,int k)
    {  if(lo>hi) return;
            // if(lo==hi) 
            // {
            //     if(lo==k-1) ans=arr[lo];
            //     return;
            // }
            int idx=partition(arr,lo,hi);
            if(idx==k-1)
                {
                     ans= arr[idx];
                     return;
          
                }
            if(idx<k-1)
            {
                quickSort(arr,idx+1,hi,k);
            }
            else
            {
                quickSort(arr,lo,idx-1,k);
            }

    }
    public int findKthLargest(int[] nums, int k) {
        ans=-1;
        int n=nums.length;
        quickSort(nums,0,n-1,n-k+1);
        return ans;
    }
}