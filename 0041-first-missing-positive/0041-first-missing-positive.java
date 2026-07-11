class Solution {
    public int firstMissingPositive(int[] nums) {
        // int n=nums.length; //method 1 O(n*2)
        // for(int num=1;num<=n+1;num++)
        // {
        //     boolean flag=false;
        //     for(int ele:nums)
        //     {
        //         if(ele==num)
        //         {
        //             flag=true;
        //             break;
        //         }
        //     }
        //   if(flag==false) return num;
        // }
        //    return 0;


        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int ele: nums)
        {
            set.add(ele);
        }
        for(int num=1;num<=n+1;num++)
        {
            if(!set.contains(num)) return num;
        }
        return 0;
    }
}