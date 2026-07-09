class Solution {
    
    public static void merge(int arr[],int low ,int mid,int high)
    {
        List <Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        
        while((left<=mid)&&(right<=high))
        {
            if(arr[left]<arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }
    }
    public static int countpair(int arr[],int low,int mid,int high)
    {
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++)
        {
            while((right<=high)&&((long)arr[i]>2*(long)arr[right]))
            {
                right++;
            }
             count+=right-(mid+1);
        }
        return count;
    }
    public static int mergesort(int arr[],int low,int high)
    {
        int count=0;
       if (low >= high) {
    return 0;
      }

        int mid=(low+high)/2;
        count+=mergesort(arr,low,mid);
        count+=mergesort(arr,mid+1,high);
        count+=countpair(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }
    public int reversePairs(int[] nums) {
      int n=nums.length;
      int count=0;
      count=mergesort(nums,0,n-1);
      return count;
        
    }
}