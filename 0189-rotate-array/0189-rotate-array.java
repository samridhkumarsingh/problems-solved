class Solution {
    public void rotate(int[] nums, int k) {
        int  n=nums.length; 
        k=k%n;
        // int[] arr=new int[n];//brute force
        // for(int i=0;i<k;i++)
        // {
        //     arr[i]=nums[n-k+i];
        // }
        // for(int j=0;j<n-k;j++)
        // {
        //     arr[k+j]=nums[j];
        // }
        // for(int i=0; i<n; i++){
        //   nums[i]=arr[i];
        // }
        int temp;
        int i=0,j=n-k-1;
        while(i<j)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        int l=n-k,m=n-1;
        while(l<m)
        {
             temp=nums[l];
            nums[l]=nums[m];
            nums[m]=temp;
            l++;
            m--;
        }
        int o=0,p=n-1;
         while(o<p)
        {
             temp=nums[o];
            nums[o]=nums[p];
            nums[p]=temp;
            o++;
            p--;
        }
    }
}