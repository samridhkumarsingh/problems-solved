class Solution {
    public int[] productExceptSelf(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>(); //extra space using hashMap
        // for(int i=1;i<nums.length;i++)
        // {
        //     map.put(i,map.getOrDefault(i-1,1)*nums[i-1]);
        // }

        //      int temp=nums[nums.length-1];
        // for(int i=nums.length-1;i>0;i--)
        // {
        //    int temp2=nums[i];
        //     nums[i]=map.get(i);
        //     if(i<nums.length-1)
        //     {
             
        //      nums[i]=nums[i]*temp;
        //     temp*=temp2;
        //     }
        // }
        // nums[0]=temp;

        // return nums;

        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++)
        {
            ans[i]=ans[i-1]*nums[i-1];
        }
        int temp=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            ans[i]*=temp;
            temp*=nums[i];
        }

        return ans;
    }
}