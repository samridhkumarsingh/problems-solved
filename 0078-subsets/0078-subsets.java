class Solution {
    public void sub(int indx,List<Integer>ans,List<List<Integer>>rsl,int[] nums)
    {
        if(indx>=nums.length)
        {
            rsl.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[indx]);
        sub(indx+1,ans,rsl,nums);
        ans.remove(ans.size()-1);
        sub(indx+1,ans,rsl,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>>rsl=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        sub(0,ans,rsl,nums);
        return rsl;

        
    }
}