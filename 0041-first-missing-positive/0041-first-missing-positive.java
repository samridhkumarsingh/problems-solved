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


        // int n=nums.length;  //method 2     //O(n) && space O(n) 
        // HashSet<Integer>set=new HashSet<>();
        // for(int ele: nums)
        // {
        //     set.add(ele);
        // }
        // for(int num=1;num<=n+1;num++)
        // {
        //     if(!set.contains(num)) return num;
        // }
        // return 0;

        int n=nums.length;
        int i=0;
        while(i<n)
        {
            if(nums[i]==i+1||nums[i]>n||nums[i]<=0 || nums[i]==nums[nums[i]-1]) i++;
            else
            {
                swap(i,nums[i]-1,nums);
            }
        }
        for( i=0;i<n;i++)
        {
            if(nums[i]!=i+1) return i+1;
        }
        return i+1;
    }
      public void swap(int i,int j,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}