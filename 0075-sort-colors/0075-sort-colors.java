class Solution {
    public void sortColors(int[] nums) {
        int n =nums.length;
        int mid =0;
        int hight= n-1;
        int low =0;
        int a;
        while(hight>=mid)
        {
            if(nums[mid]==0)
            {
                a=nums[low];
                nums[low]=nums[mid];
                nums[mid]=a;
                mid++;
                low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else if(nums[mid]==2)
            {
                a=nums[mid];
                nums[mid]=nums[hight];
                nums[hight]=a;
                hight--;
            }
        }
    }
}