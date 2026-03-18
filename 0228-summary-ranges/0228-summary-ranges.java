class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> arr=new ArrayList<>();
        int n=nums.length;
         if(n==0) return arr;

    //     int p=0,q=0;
    //   while(p<n-1)
    //   {
    //     if(nums[p]+1==nums[p+1])
    //     {
    //         p++;
    //     }else
    //     {
    //         if(p!=q)
    //         {
    //             arr.add(nums[q]+"->"+nums[p]);
               
    //         }else
    //         {
    //             arr.add(Integer.toString(nums[q]));
    //         }
    //          p=p+1;
    //          q=p;
    //     }
    //   }
    //    if(p!=q)
    //         {
    //             arr.add(nums[q]+"->"+nums[p]);
               
    //         }else
    //         {
    //             arr.add(Integer.toString(nums[q]));
    //         }
    //   return arr;

    int start=nums[0];
    for(int i=1;i<n;i++)
    {
        if(nums[i]!=nums[i-1]+1)
        {
            if(nums[i-1]==start)
            {
                arr.add(Integer.toString(start));
            }else
            {
                arr.add(start+"->"+nums[i-1]);
            }
            start=nums[i];
        }
    }
        if(start == nums[n-1])
            arr.add(String.valueOf(start));
        else
            arr.add(start + "->" + nums[n-1]);

        return arr;
    }
}