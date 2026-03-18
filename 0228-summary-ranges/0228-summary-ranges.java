class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> arr=new ArrayList<>();
        int n=nums.length;
        int p=0,q=0;
        if(n==0) return arr;
      while(p<n-1)
      {
        if(nums[p]+1==nums[p+1])
        {
            p++;
        }else
        {
            if(p!=q)
            {
                arr.add(nums[q]+"->"+nums[p]);
               
            }else
            {
                arr.add(Integer.toString(nums[q]));
            }
             p=p+1;
             q=p;
        }
      }
       if(p!=q)
            {
                arr.add(nums[q]+"->"+nums[p]);
               
            }else
            {
                arr.add(Integer.toString(nums[q]));
            }
      return arr;
    }
}