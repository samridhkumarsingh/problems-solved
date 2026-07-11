class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;  by sum 
        // int sum=(n*(n+1))/2;
        // int cal=0;
        // for(int i=0;i<n;i++)
        // {
        //     cal+=nums[i];
        // }
        // return sum-cal;
        int n=nums.length;
        boolean[] b=new boolean[n+1];
        for(int ele:nums)
        {
            b[ele]=true;
        }
        for(int i=0;i<=n;i++)
        {
            if(b[i]==false) return i;
        }

        return 0;
    }
}