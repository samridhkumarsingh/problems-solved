// class Solution {
    
//     public static void merge(int arr[],int low ,int mid,int high)
//     {
//         List <Integer> temp=new ArrayList<>();
//         int left=low;
//         int right=mid+1;
        
//         while((left<=mid)&&(right<=high))
//         {
//             if(arr[left]<arr[right])
//             {
//                 temp.add(arr[left]);
//                 left++;
//             }
//             else
//             {
//                 temp.add(arr[right]);
//                 right++;
//             }
//         }
//         while(left<=mid)
//         {
//             temp.add(arr[left]);
//             left++;
//         }
//         while(right<=high)
//         {
//             temp.add(arr[right]);
//             right++;
//         }
//         for(int i=low;i<=high;i++)
//         {
//             arr[i]=temp.get(i-low);
//         }
//     }
//     public static int countpair(int arr[],int low,int mid,int high)
//     {
//         int count=0;
//         int right=mid+1;
//         for(int i=low;i<=mid;i++)
//         {
//             while((right<=high)&&((long)arr[i]>2*(long)arr[right]))
//             {
//                 right++;
//             }
//              count+=right-(mid+1);
//         }
//         return count;
//     }
//     public static int mergesort(int arr[],int low,int high)
//     {
//         int count=0;
//        if (low >= high) {
//     return 0;
//       }

//         int mid=(low+high)/2;
//         count+=mergesort(arr,low,mid);
//         count+=mergesort(arr,mid+1,high);
//         count+=countpair(arr,low,mid,high);
//         merge(arr,low,mid,high);
//         return count;
//     }
//     public int reversePairs(int[] nums) {
//       int n=nums.length;
//       int count=0;
//       count=mergesort(nums,0,n-1);
//       return count;
        
//     }
// }
class Solution {
    static int count;
     public static void merge(int[] a,int[] b,int[] c)
    {
        int p=0,q=0,r=0;
        while(p<a.length &&q<b.length)
        {
            if(a[p]<=b[q])
            {
                 c[r]=a[p];
                 p++;
            }
            else{
                c[r]=b[q];
                q++;
            }
           r++;
        }
        while(p<a.length)
        {
            c[r]=a[p];
            r++;
            p++;
        }
         while(q<b.length)
        {
            c[r]=b[q];
            r++;
            q++;
        }
    }
    public static void mergesort(int[] arr )
    {
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        for(int i=0;i<n/2;i++)
        {
            a[i]=arr[i];
        }
         for(int i=0;i<n-n/2;i++)
        {
            b[i]=arr[i+n/2];
        }

        mergesort(a);
        mergesort(b);
        inversion(a, b);
        merge(a, b, arr);
        a=null;
        b=null;
    }
    public static void inversion(int[] a,int[] b)
    {
        int n=a.length;
        int m=b.length;
        int i=0,j=0;
        while(i<n&&j<m)
        {
            if((long)a[i]>((long)2*(long)b[j]))
            {
                count+=(n-i);
                j++;
            }
            else{
                i++;
            }
        }
        
    }
    public int reversePairs(int[] nums) {
        count=0;
        mergesort(nums);
        return count;
    }
}