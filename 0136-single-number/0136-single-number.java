class Solution {
    public int singleNumber(int[] nums) { //revice
        int ans=0;
        for(int n:nums)
        {
            ans=ans^n;
        }
        return ans;
    }
}