class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        k=k%n;
        int i=0,j=n-k-1;
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        int l=n-k,m=n-1;
         while(l<m)
        {
            int temp=nums[l];
            nums[l]=nums[m];
            nums[m]=temp;
            l++;
            m--;
        }
        int p=0,q=n-1;
         while(p<q)
        {
            int temp=nums[p];
            nums[p]=nums[q];
            nums[q]=temp;
            p++;
            q--;
        }
    }
}