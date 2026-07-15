class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] ans=new int[n];
       int i=0,j=0;
       while(i<n)
       {
        if(nums1[i]==nums2[j])
        {
           ans[i]=check(nums2,nums1[i],j);
           i++;
           j=0;
        }else
        {
            j++;
        }
       }
       return ans;
    }

    public int check(int[] arr,int i,int j)
    {
        for(int x=j+1;x<arr.length;x++)
        {
            if(arr[x]>i)
            {
                return arr[x];
            }
        }

        return -1;
    }
}