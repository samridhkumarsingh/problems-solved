class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int p=0,q=nums.length-1;
        int c=0;
        while(p<q)
        {
            if(nums[p]+nums[q]==k)
            {
                c++;
                p++;
                q--;
            }
            else if(nums[p]+nums[q]<k)
            {
                p++;
            }
            else
            {
                q--;
            }
        }
        return c;
    }
}