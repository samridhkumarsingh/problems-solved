// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {

//         for(int i =m;i<m+n;i++)
//         {
//             nums1[i]=nums2[i-m];
//         }
//         Arrays.sort(nums1) ; 
//     }
// }

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=nums1.length;
        int p=m-1,q=n-1,r=x-1;
        while(q>=0)
        {
            if(p>=0 && nums1[p]>nums2[q])
            {
                nums1[r]=nums1[p];
                p--;
            }
            else
            {
                nums1[r]=nums2[q];
                q--;
            }
               r--;
        }
    }
}